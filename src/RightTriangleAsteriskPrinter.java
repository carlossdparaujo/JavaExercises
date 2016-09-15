public class RightTriangleAsteriskPrinter {

    public static String printValue(int lines) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < lines; ++i) {
            for (int j = 0; j <= i; j++) {
                builder.append("*");
            }

            if (i < lines - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
}
