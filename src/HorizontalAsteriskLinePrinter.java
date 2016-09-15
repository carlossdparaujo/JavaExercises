public class HorizontalAsteriskLinePrinter {

    public static String printValue(int asterisksNumber) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < asterisksNumber; ++i) {
            builder.append("*");
        }

        return builder.toString();
    }
}
