public class VerticalLineAsteriskPrinter {

    public static String printValue(int number) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < number; ++i) {
            builder.append("*");

            if (i < number - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
}
