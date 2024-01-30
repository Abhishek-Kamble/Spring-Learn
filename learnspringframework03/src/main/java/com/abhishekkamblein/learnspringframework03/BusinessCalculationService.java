package com.abhishekkamblein.learnspringframework03;

import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
  public BusinessCalculationService(DataService dataService) {
    super();
    this.dataService = dataService;
  }

  private DataService dataService;
  public int findMax(){
    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
