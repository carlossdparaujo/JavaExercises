public class DiamondAsteriskPrinter {

    protected int n;
    private int diamondHeight;
    private int diamondWidth;

    public String printValue(int n) {
        this.n = n;
        this.diamondHeight = getDiamondHeight(n);
        this.diamondWidth = getDiamondWidth(n);

        StringBuilder builder = new StringBuilder();
        buildDiamond(builder, 0);
        return builder.toString();
    }

    private int getDiamondHeight(int lines) {
        return lines*2 - 1;
    }

    private int getDiamondWidth(int lines) {
        return 1 + (lines - 1)*2;
    }

    private void buildDiamond(StringBuilder builder, int currentLine) {
        if (n <= 0) {
            return;
        }

        buildLine(builder, currentLine);

        if (currentLine == diamondHeight - 1) {
            return;
        }

        buildDiamond(builder, currentLine + 1);
    }

    protected void buildLine(StringBuilder builder, int currentLine) {
        fillLine(builder, currentLine);
        addLineBreaker(builder, currentLine);
    }

    protected void fillLine(StringBuilder builder, int currentLine) {
        for (int j = 0; j < diamondWidth; ++j) {
            if (canAppendAsterisk(j, currentLine)) {
                builder.append("*");
            } else {
                builder.append(" ");
            }
        }
    }

    private boolean canAppendAsterisk(int index, int currentLine) {
        return index >= getFirstAsteriskIndex(currentLine) && index <= getLastAsteriskIndex(currentLine);
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

    protected void addLineBreaker(StringBuilder builder, int currentLine) {
        if (currentLine < diamondHeight - 1) {
            builder.append("\n");
        }
    }
}
