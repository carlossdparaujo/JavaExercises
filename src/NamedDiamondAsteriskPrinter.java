public class NamedDiamondAsteriskPrinter {

    public static String printValue(int lines, String name) {
        StringBuilder builder = new StringBuilder();

        buildDiamond(builder, 0, lines, name);

        return builder.toString();
    }

    private static void buildDiamond(StringBuilder builder, int currentLine, int lines, String name) {
        if (lines <= 0) {
            return;
        }

        printLine(builder, currentLine, lines, name);

        if (currentLine == getDiamondSize(lines) - 1) {
            return;
        }

        buildDiamond(builder, currentLine + 1, lines, name);
    }

    private static void printLine(StringBuilder builder, int diamondLine, int lines, String name) {
        int currentLine = diamondLine;
        if (diamondLine >= lines) {
            currentLine = (getDiamondSize(lines) - 1) - diamondLine;
        }

        if (diamondLine == lines - 1) {
            builder.append(name);
        } else {
            for (int j = 0; j < getCenterSize(lines); ++j) {
                if (j >= getFirstAsteriskIndex(currentLine, lines) && j <= getLastAsteriskIndex(currentLine, lines)) {
                    builder.append("*");
                } else {
                    builder.append(" ");
                }
            }
        }

        if (diamondLine < getDiamondSize(lines) - 1) {
            builder.append("\n");
        }
    }

    private static int getDiamondSize(int lines) {
        return lines*2 - 1;
    }

    private static int getCenterSize(int lines) {
        return 1 + (lines - 1)*2;
    }

    private static int getLastAsteriskIndex(int currentLine, int lines) {
        return (getCenterSize(lines) - 1) - getFirstAsteriskIndex(currentLine, lines);
    }

    private static int getFirstAsteriskIndex(int currentLine, int lines) {
        return (getCenterSize(lines) - getAsterisksPerLine(currentLine))/2;
    }

    private static int getAsterisksPerLine(int line) {
        return (line*2 + 1);
    }
}
