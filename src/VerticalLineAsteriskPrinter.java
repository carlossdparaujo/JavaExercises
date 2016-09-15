public class VerticalLineAsteriskPrinter {

    public static String printValue(int asterisksNumber) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < asterisksNumber; ++i) {
            builder.append("*");

            if (i < asterisksNumber - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
}
