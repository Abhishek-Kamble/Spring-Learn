package com.mylearning.learnspringframework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component //@Named
class BusinessService {
  DataService dataService;

  public DataService getDataService() {
    System.out.println("Setter injection");
    return dataService;
  }

  @Autowired //Can use @Inject
  public void setDataService(DataService dataService) {
    this.dataService = dataService;
  }
}

@Component
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
//  -    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean(BusinessService.class).getDataService());
    }

  }
}
