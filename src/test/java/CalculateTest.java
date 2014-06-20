/*http://devcolibri.com/864*/
import com.engagepoint.hello.Calculate;
import org.junit.Test;
import static junit.framework.Assert.*;

public class CalculateTest {
    @Test
         public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);

        assertEquals(4, n);
    }
    @Test
    public void testCalB() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calB(2, 2);

        assertEquals("Must be 0", 0, n);
    }
}