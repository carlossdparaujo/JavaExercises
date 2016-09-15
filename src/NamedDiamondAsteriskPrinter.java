public class NamedDiamondAsteriskPrinter extends DiamondAsteriskPrinter {

    private final String name;

    public NamedDiamondAsteriskPrinter(int n, String name) {
        super(n);

        this.name = name;
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
