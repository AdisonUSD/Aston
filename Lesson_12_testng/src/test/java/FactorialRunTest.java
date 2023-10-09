import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialRunTest {
@Test
    public void factorials() {
        long actual = Factorial.factorials(2);
        long expected = 3;
        Assert.assertEquals(actual, expected);
    }

}