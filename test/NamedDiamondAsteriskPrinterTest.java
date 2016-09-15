import org.junit.Test;
import static org.junit.Assert.*;

public class NamedDiamondAsteriskPrinterTest {

    private static final String NAME = "Carlos";

    @Test
    public void shouldPrintNothing() {
        assertEquals("", getPrintedDiamond(0));
    }

    @Test
    public void shouldPrintOnlyTheName() {
        assertEquals(NAME, getPrintedDiamond(1));
    }

    @Test
    public void shouldPrintANamedThreeLineDiamond() {
        assertEquals(" * \n" + NAME + "\n * ", getPrintedDiamond(2));
    }

    @Test
    public void shouldPrintANamedFiveLineDiamond() {
        assertEquals("  *  \n *** \n" + NAME + "\n *** \n  *  ", getPrintedDiamond(3));
    }

    @Test
    public void shouldPrintNothing_whenGivenNegativeValue() {
        assertEquals("", getPrintedDiamond(-1));
    }

    private String getPrintedDiamond(int n) {
        return new NamedDiamondAsteriskPrinter().printValue(n, NAME);
    }
}