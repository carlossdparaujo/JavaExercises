import org.junit.Test;
import static org.junit.Assert.*;

public class IsoscelesTriangleAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", getPrintedTriangle(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", getPrintedTriangle(1));
    }

    @Test
    public void shouldPrintTwoLineIsoscelesTriangle() {
        assertEquals(" * \n***", getPrintedTriangle(2));
    }

    @Test
    public void shouldPrintFiveLineIsoscelesTriangle() {
        assertEquals("    *    \n   ***   \n  *****  \n ******* \n*********", getPrintedTriangle(5));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", getPrintedTriangle(-1));
    }

    private String getPrintedTriangle(int n) {
        return new IsoscelesTriangleAsteriskPrinter().printValue(n);
    }
}