import org.junit.Test;
import static org.junit.Assert.*;

public class DiamondAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", DiamondAsteriskPrinter.printValue(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", DiamondAsteriskPrinter.printValue(1));
    }

    @Test
    public void shouldPrintAThreeLineDiamond() {
        assertEquals(" * \n***\n * ", DiamondAsteriskPrinter.printValue(2));
    }

    @Test
    public void shouldPrintAFiveLineDiamond() {
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", DiamondAsteriskPrinter.printValue(3));
    }

    @Test
    public void shouldPrintASevenLineDiamond() {
        assertEquals("   *   \n  ***  \n ***** \n*******\n ***** \n  ***  \n   *   ", DiamondAsteriskPrinter.printValue(4));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", DiamondAsteriskPrinter.printValue(-1));
    }
}