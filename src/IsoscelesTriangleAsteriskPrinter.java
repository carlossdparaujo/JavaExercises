public class IsoscelesTriangleAsteriskPrinter {

    public static String printValue(int lines) {
        StringBuilder builder = new StringBuilder();

        int baseSize = getBaseSize(lines);

        for (int i = 0; i < lines; ++i) {
            for (int j = 0; j < baseSize; ++j) {
                if (j >= getFirstAsteriskIndex(i, lines) && j <= getLastAsteriskIndex(i, lines)) {
                    builder.append("*");
                } else {
                    builder.append(" ");
                }
            }

            if (i < lines - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }

    private static int getBaseSize(int lines) {
        return 1 + (lines - 1)*2;
    }

    private static int getLastAsteriskIndex(int currentLine, int lines) {
        return (getBaseSize(lines) - 1) - getFirstAsteriskIndex(currentLine, lines);
    }
    
    private static int getFirstAsteriskIndex(int currentLine, int lines) {
        return (getBaseSize(lines) - getAsterisksPerLine(currentLine))/2;
    }

    private static int getAsterisksPerLine(int line) {
        return (line*2 + 1);
    }
}
