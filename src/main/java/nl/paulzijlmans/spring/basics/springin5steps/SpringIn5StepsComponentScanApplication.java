package nl.paulzijlmans.spring.basics.springin5steps;

import nl.paulzijlmans.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("nl.paulzijlmans.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

  static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class)) {

      ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

      LOGGER.info("{}", componentDAO);
    }
  }
}
