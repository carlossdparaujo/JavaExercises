public class Exercises {

    public static void main(String[] args) {
        System.out.println("Exercise 1)\n");
        System.out.println(OneAsteriskPrinter.printValue());
        System.out.println("");

        System.out.println("Exercise 2)\n");
        System.out.println(HorizontalAsteriskLinePrinter.printValue(8));
        System.out.println("");

        System.out.println("Exercise 3)\n");
        System.out.println(VerticalLineAsteriskPrinter.printValue(8));
        System.out.println("");

        System.out.println("Exercise 4)\n");
        System.out.println(RightTriangleAsteriskPrinter.printValue(5));
        System.out.println("");

        System.out.println("Exercise 5)\n");
        System.out.println(IsoscelesTriangleAsteriskPrinter.printValue(3));
        System.out.println("");

        System.out.println("Exercise 6)\n");
        System.out.println(new DiamondAsteriskPrinter().printValue(3));
        System.out.println("");

        System.out.println("Exercise 7)\n");
        System.out.println(new NamedDiamondAsteriskPrinter().printValue(5, "Carlos"));
        System.out.println("");

        System.out.println("Exercise 8)\n");
        FizzBuzzPrinter.fizzBuzz();
        System.out.println("");

        System.out.println("Exercise 9)\n");

        for (int i = 1; i <= 50; ++i) {
            System.out.println("Prime Factors of " + i + ": " + PrimeFactorPrinter.generate(i));
        }

        System.out.println("");
    }
}
