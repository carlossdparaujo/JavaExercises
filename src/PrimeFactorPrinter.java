import java.util.ArrayList;
import java.util.List;

public class PrimeFactorPrinter {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        checkFactors(n, factors);
        return factors;
    }

    private static void checkFactors(int n, List<Integer> factors) {
        for (int i = 2; i <= n; ++i) {
            if (n%i == 0) {
                factors.add(i);
                checkFactors(n/i, factors);
                return;
            }
        }
    }
}
