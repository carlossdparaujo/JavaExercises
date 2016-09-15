import org.junit.Test;
import static org.junit.Assert.*;

public class NamedDiamondAsteriskPrinterTest {

    @Test
    public void shouldPrintNothing() {
        assertEquals("", NamedDiamondAsteriskPrinter.printValue(0, "Carlos"));
    }

    @Test
    public void shouldPrintOnlyTheName() {
        assertEquals("Carlos", NamedDiamondAsteriskPrinter.printValue(1, "Carlos"));
    }

    @Test
    public void shouldPrintANamedThreeLineDiamond() {
        assertEquals(" * \nCarlos\n * ", NamedDiamondAsteriskPrinter.printValue(2, "Carlos"));
    }

    @Test
    public void shouldPrintANamedFiveLineDiamond() {
        assertEquals("  *  \n *** \nCarlos\n *** \n  *  ", NamedDiamondAsteriskPrinter.printValue(3, "Carlos"));
    }

    @Test
    public void shouldPrintNothing_whenGivenNegativeValue() {
        assertEquals("", NamedDiamondAsteriskPrinter.printValue(-1, "Carlos"));
    }
}