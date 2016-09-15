public class NamedDiamondAsteriskPrinter extends DiamondAsteriskPrinter {

    private String name;

    public String printValue(int n, String name) {
        this.name = name;
        return printValue(n);
    }

    @Override
    protected void buildLine(StringBuilder builder, int currentLine) {
        if (currentLine == n - 1) {
            addName(builder);
        } else {
            fillLine(builder, currentLine);
        }

        addLineBreaker(builder, currentLine);
    }

    private void addName(StringBuilder builder) {
        builder.append(name);
    }
}
