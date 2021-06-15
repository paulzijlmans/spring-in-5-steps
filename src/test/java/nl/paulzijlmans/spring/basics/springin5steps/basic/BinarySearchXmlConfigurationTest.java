package nl.paulzijlmans.spring.basics.springin5steps.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/testContext.xml")
class BinarySearchXmlConfigurationTest {

    @Autowired BinarySearchImpl binarySearch;

    @Test
    void testBasicScenario() {
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(3, actualResult);
    }
}
