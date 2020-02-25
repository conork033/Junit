package ie.gmit;




import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class CounterTest {

    private Counter myCounter;

    @BeforeEach
    void init()
    {
        myCounter = new Counter();

    }

    @Test
    void testConstuctor()
    {
        assertEquals(0,myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        assertEquals(1,myCounter.increment());
    }

    @Test
    void testDecrement()
    {
        assertEquals(-1,myCounter.decrement());
    }

    @Test
    void testFailure()
    {
        assertThrows(IllegalArgumentException.class,()->{new Counter(-1);});
    }
}
