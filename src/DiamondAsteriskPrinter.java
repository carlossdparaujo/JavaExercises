public class DiamondAsteriskPrinter {

    private final int n;
    private final int diamondHeight;
    private final int diamondWidth;

    public DiamondAsteriskPrinter(int n) {
        this.n = n;
        this.diamondHeight = getDiamondHeight(n);
        this.diamondWidth = getDiamondWidth(n);
    }

    private static int getDiamondHeight(int lines) {
        return lines*2 - 1;
    }

    private static int getDiamondWidth(int lines) {
        return 1 + (lines - 1)*2;
    }

    public String printValue() {
        StringBuilder builder = new StringBuilder();
        buildDiamond(builder, 0);
        return builder.toString();
    }

    private void buildDiamond(StringBuilder builder, int currentLine) {
        if (n <= 0) {
            return;
        }

        printLine(builder, currentLine);

        if (currentLine == diamondHeight - 1) {
            return;
        }

        buildDiamond(builder, currentLine + 1);
    }

    private void printLine(StringBuilder builder, int currentLine) {
        for (int j = 0; j < diamondWidth; ++j) {
            if (j >= getFirstAsteriskIndex(currentLine) && j <= getLastAsteriskIndex(currentLine)) {
                builder.append("*");
            } else {
                builder.append(" ");
            }
        }

        if (currentLine < diamondHeight - 1) {
            builder.append("\n");
        }
    }

    private int getFirstAsteriskIndex(int currentLine) {
        return (diamondWidth - getNumberOfAsterisksOnLine(currentLine))/2;
    }

    private int getNumberOfAsterisksOnLine(int currentLine) {
        if (currentLine >= n) {
            currentLine = (diamondHeight - 1) - currentLine;
        }

        return currentLine*2 + 1;
    }

    private int getLastAsteriskIndex(int currentLine) {
        return (diamondWidth - 1) - getFirstAsteriskIndex(currentLine);
    }
}
