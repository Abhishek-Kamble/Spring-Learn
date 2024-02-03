package com.abhishekkamblein.learnspringframework03;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
  public BusinessCalculationService(DataService dataService) {
    super();
    this.dataService = dataService;
  }

  private DataService dataService;
  @PreDestroy
  public int findMax(){
    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
