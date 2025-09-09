import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestSub {

    @Test
    public void SubTest() {
        Sub sub = new Sub();

        assertEquals(2, sub.sub(5, 3));

        assertEquals(3, sub.sub(10, 7));
    }
}
