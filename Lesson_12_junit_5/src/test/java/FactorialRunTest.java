import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialRunTest {
    @Test
    public void factorials() {
        long actual = Factorial.factorials(2);
        long expected = 2;
        assertEquals(actual, expected);
    }
}