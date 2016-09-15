import org.junit.Test;
import static org.junit.Assert.*;

public class HorizontalAsteriskLinePrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", HorizontalAsteriskLinePrinter.printValue(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", HorizontalAsteriskLinePrinter.printValue(1));
    }

    @Test
    public void shouldPrintTwoAsterisksInAHorizontalLine() {
        assertEquals("**", HorizontalAsteriskLinePrinter.printValue(2));
    }

    @Test
    public void shouldPrintSevenAsterisksInAHorizontalLine() {
        assertEquals("*******", HorizontalAsteriskLinePrinter.printValue(7));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", HorizontalAsteriskLinePrinter.printValue(-1));
    }
}