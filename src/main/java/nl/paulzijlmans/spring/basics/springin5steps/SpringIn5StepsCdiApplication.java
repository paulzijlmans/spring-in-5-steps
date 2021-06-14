package nl.paulzijlmans.spring.basics.springin5steps;

import nl.paulzijlmans.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

  static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {

      SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

      LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
    }
  }
}
