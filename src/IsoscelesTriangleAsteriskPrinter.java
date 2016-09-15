public class IsoscelesTriangleAsteriskPrinter {

    public static String printValue(int lines) {
        StringBuilder builder = new StringBuilder();

        int baseSize = 1 + (lines - 1)*2;
        int middleIndex = (baseSize - 1)/2;

        int asterisksInLine = 1;
        for (int i = 0; i < lines; ++i) {
            int spaces = ((asterisksInLine - 1)/2);

            for (int j = 0; j < baseSize; ++j) {
                if (j >= middleIndex - spaces && j <= middleIndex + spaces) {
                    builder.append("*");
                } else {
                    builder.append(" ");
                }
            }

            asterisksInLine += 2;

            if (i < lines - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
}
