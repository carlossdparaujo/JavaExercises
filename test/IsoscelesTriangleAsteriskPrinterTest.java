import org.junit.Test;
import static org.junit.Assert.*;

public class IsoscelesTriangleAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", IsoscelesTriangleAsteriskPrinter.printValue(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", IsoscelesTriangleAsteriskPrinter.printValue(1));
    }

    @Test
    public void shouldPrintTwoLineIsoscelesTriangle() {
        assertEquals(" * \n***", IsoscelesTriangleAsteriskPrinter.printValue(2));
    }

    @Test
    public void shouldPrintFiveLineIsoscelesTriangle() {
        assertEquals("    *    \n   ***   \n  *****  \n ******* \n*********", IsoscelesTriangleAsteriskPrinter.printValue(5));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", IsoscelesTriangleAsteriskPrinter.printValue(-1));
    }
}