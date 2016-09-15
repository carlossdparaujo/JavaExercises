public class FizzBuzzPrinter {

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; ++i) {
            String text = "";

            if (i%3 == 0) {
                text += "Fizz";
            }

            if (i%5 == 0) {
                text += "Buzz";
            }

            if (text.isEmpty()) {
                text = String.valueOf(i);
            }

            System.out.println(text);
        }
    }
}
