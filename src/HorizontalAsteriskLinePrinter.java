public class HorizontalAsteriskLinePrinter {

    public static String printValue(int number) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < number; ++i) {
            builder.append("*");
        }

        return builder.toString();
    }
}
