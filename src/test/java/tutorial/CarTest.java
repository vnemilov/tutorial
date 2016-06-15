package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by vemilov on 15.6.2016 г..
 */
public class CarTest {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWarningTooHigh(){
        when(engine.getRpm()).thenReturn(6000);
        car.accelerate();
        assertEquals("Slow Down!", car.getWarningMessage());
    }

    @Test
    public void testWarningTooLow(){
        System.out.println(engine.getRpm());
        when(engine.getRpm()).thenReturn(2000);

        car.decelerate();
        System.out.println(engine.getRpm());
        assertEquals("Speed Up!", car.getWarningMessage());
    }
}
