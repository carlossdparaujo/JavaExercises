import org.junit.Test;
import static org.junit.Assert.*;

public class DiamondAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", getPrintedDiamond(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", getPrintedDiamond(1));
    }

    @Test
    public void shouldPrintAThreeLineDiamond() {
        assertEquals(" * \n***\n * ", getPrintedDiamond(2));
    }

    @Test
    public void shouldPrintAFiveLineDiamond() {
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", getPrintedDiamond(3));
    }

    @Test
    public void shouldPrintASevenLineDiamond() {
        assertEquals("   *   \n  ***  \n ***** \n*******\n ***** \n  ***  \n   *   ", getPrintedDiamond(4));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", getPrintedDiamond(-1));
    }

    private String getPrintedDiamond(int n) {
        return new DiamondAsteriskPrinter(n).printValue();
    }
}