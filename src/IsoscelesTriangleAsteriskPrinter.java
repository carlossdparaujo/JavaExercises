public class IsoscelesTriangleAsteriskPrinter {

    private int height;
    private int baseWidth;

    public String printValue(int n) {
        this.height = n;
        this.baseWidth = getBaseWidth();

        StringBuilder builder = new StringBuilder();
        buildTriangle(builder);
        return builder.toString();
    }

    private int getBaseWidth() {
        return 1 + (height - 1)*2;
    }

    private void buildTriangle(StringBuilder builder) {
        for (int i = 0; i < height; ++i) {
            fillLine(builder, i);

            if (i < height - 1) {
                builder.append("\n");
            }
        }
    }

    private void fillLine(StringBuilder builder, int currentLine) {
        for (int j = 0; j < baseWidth; ++j) {
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
        return (baseWidth - getAsterisksPerLine(currentLine))/2;
    }

    private int getAsterisksPerLine(int line) {
        return (line*2 + 1);
    }

    private int getLastAsteriskIndex(int currentLine) {
        return (baseWidth - 1) - getFirstAsteriskIndex(currentLine);
    }
}
