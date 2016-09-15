import org.junit.Test;
import static org.junit.Assert.*;

public class RightTriangleAsteriskPrinterTest {

    @Test
    public void shouldPrintNoAsterisk() {
        assertEquals("", RightTriangleAsteriskPrinter.printValue(0));
    }

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", RightTriangleAsteriskPrinter.printValue(1));
    }

    @Test
    public void shouldPrintATwoLineAsterisksRightTriangle() {
        assertEquals("*\n**", RightTriangleAsteriskPrinter.printValue(2));
    }

    @Test
    public void shouldPrintAThreeLineAsterisksRightTriangle() {
        assertEquals("*\n**\n***", RightTriangleAsteriskPrinter.printValue(3));
    }

    @Test
    public void shouldPrintAFiveLineAsterisksRightTriangle() {
        assertEquals("*\n**\n***\n****\n*****", RightTriangleAsteriskPrinter.printValue(5));
    }

    @Test
    public void shouldPrintNoAsterisk_whenGivenNegativeValue() {
        assertEquals("", RightTriangleAsteriskPrinter.printValue(-1));
    }
}