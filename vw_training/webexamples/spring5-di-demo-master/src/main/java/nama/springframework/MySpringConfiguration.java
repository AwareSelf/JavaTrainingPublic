package nama.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class MySpringConfiguration {

  @Bean(name="myspringbean",initMethod = "onInitialize", destroyMethod = "onDestroy")
  public MySpringBean mySpringBean() {
    return new MySpringBean("springlifecycle demo");
  }
  
  
 
}