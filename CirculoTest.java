import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {
    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0, c.getRadio());
    }
    @Test
    public void testGetRadio() {
        Circulo c = new Circulo(5.0);
        assertEquals(5.0, c.getRadio(), 0.0);
    }
    @Test
    public void testSetRadio() {
        Circulo c = new Circulo(2.0);
        c.setRadio(7.5);
        assertEquals(7.5, c.getRadio(), 0.0);
    }
}