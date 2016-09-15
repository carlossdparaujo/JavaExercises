import org.junit.Test;
import static org.junit.Assert.*;

public class OneAsteriskPrinterTest {

    @Test
    public void shouldPrintOneAsterisk() {
        assertEquals("*", OneAsteriskPrinter.printValue());
    }
}