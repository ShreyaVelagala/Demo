import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;

public class DemoTester {
    int[] intArray = {0,1,2,3};
    @Test
    public void arrayAverage() {
        assertEquals(4, Demo.averageArray(intArray));
    }
}
