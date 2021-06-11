package nl.paulzijlmans.spring.basics.springin5steps;

import nl.paulzijlmans.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need, everything is in the same package

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println(result);
    }

}
