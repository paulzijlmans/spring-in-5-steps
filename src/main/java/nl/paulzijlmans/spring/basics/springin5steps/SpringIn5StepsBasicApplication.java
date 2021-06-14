package nl.paulzijlmans.spring.basics.springin5steps;

import nl.paulzijlmans.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need, everything is in the same package

    public static void main(String[] args) {
        // Application Context
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

            System.out.println(result);
        }
    }
}
