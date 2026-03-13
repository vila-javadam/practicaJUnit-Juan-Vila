import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {
    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0, c.getRadio());
    }
}