
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CalcTest {

    Calc calc;

    @Before
    public void before() {
        calc = new Calc();
    }

    @Test
    public void canAdd() {
        assertEquals(10, calc.add(2,8));
    }

    @Test
    public void canSubtract() {
        assertEquals(8, calc.subtract(10, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(20, calc.multiply(10, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(2, calc.divide(5, 10));
    }
}