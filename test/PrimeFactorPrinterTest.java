import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorPrinterTest {

    @Test
    public void shouldReturnEmptyList_whenGivenZero() {
        assertEquals(0, PrimeFactorPrinter.generate(0).size());
    }

    @Test
    public void shouldReturnEmptyList_whenGivenNegativeValue() {
        assertEquals(0, PrimeFactorPrinter.generate(-1).size());
    }

    @Test
    public void shouldReturnEmptyList_whenGivenOne() {
        assertEquals(0, PrimeFactorPrinter.generate(1).size());
    }

    @Test
    public void shouldReturnEmptyList_whenGivenTwo() {
        List<Integer> factorsList = PrimeFactorPrinter.generate(2);

        assertEquals(1, factorsList.size());
        assertTrue(2 == factorsList.get(0));
    }

    @Test
    public void shouldReturnEmptyList_whenGivenThree() {
        List<Integer> factorsList = PrimeFactorPrinter.generate(3);

        assertEquals(1, factorsList.size());
        assertTrue(3 == factorsList.get(0));
    }

    @Test
    public void shouldReturnListWithThreeAndFive() {
        List<Integer> factorsList = PrimeFactorPrinter.generate(15);

        assertEquals(2, factorsList.size());
        assertTrue(3 == factorsList.get(0));
        assertTrue(5 == factorsList.get(1));
    }

    @Test
    public void shouldReturnListWithTwoAndThreeAndFive() {
        List<Integer> factorsList = PrimeFactorPrinter.generate(30);

        assertEquals(3, factorsList.size());
        assertTrue(2 == factorsList.get(0));
        assertTrue(3 == factorsList.get(1));
        assertTrue(5 == factorsList.get(2));
    }

    @Test
    public void shouldReturnListWithTwoAndSeventyNine() {
        List<Integer> factorsList = PrimeFactorPrinter.generate(237);

        assertEquals(2, factorsList.size());
        assertTrue(3 == factorsList.get(0));
        assertTrue(79 == factorsList.get(1));
    }
}