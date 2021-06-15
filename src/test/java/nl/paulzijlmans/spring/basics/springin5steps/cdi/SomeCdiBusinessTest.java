package nl.paulzijlmans.spring.basics.springin5steps.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

    @Mock SomeCdiDao daoMock;

    @InjectMocks SomeCdiBusiness business;

    @Test
    void testBasicScenario() {
        when(daoMock.getData()).thenReturn(new int[] {2, 4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    void testBasicScenario_NoElements() {
        when(daoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    void testBasicScenario_EqualElements() {
        when(daoMock.getData()).thenReturn(new int[] {2, 2});
        assertEquals(2, business.findGreatest());
    }
}
