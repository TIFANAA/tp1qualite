import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd() {
        Add calculator = new Add();
        assertEquals(5, calculator.add(2, 3));
    }
}
