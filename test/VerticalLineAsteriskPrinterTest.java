import org.junit.Test;
import static org.junit.Assert.*;

public class VerticalLineAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", VerticalLineAsteriskPrinter.printValue(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", VerticalLineAsteriskPrinter.printValue(1));
    }

    @Test
    public void shouldPrintTwoAsterisksInAVerticalLine() {
        assertEquals("*\n*", VerticalLineAsteriskPrinter.printValue(2));
    }

    @Test
    public void shouldPrintSevenAsterisksInAVerticalLine() {
        assertEquals("*\n*\n*\n*\n*\n*\n*", VerticalLineAsteriskPrinter.printValue(7));
    }
}