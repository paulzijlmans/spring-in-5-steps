package nl.paulzijlmans.spring.basics.springin5steps;

import nl.paulzijlmans.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlContextApplication {

    public static void main(String[] args) {
        // Application Context
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(xmlPersonDAO);
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());
        }
    }
}
