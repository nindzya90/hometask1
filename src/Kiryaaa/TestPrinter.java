package Kiryaaa;

public class TestPrinter {
    public static void main(String[] args) {
        SquarePrinter squarePrinter = new SquarePrinter();
        StringPrinter stringPrinter = new StringPrinter();

        stringPrinter.printInfo();
        squarePrinter.printInfo();
        squarePrinter.print();
        stringPrinter.print();
        squarePrinter.resultPow();

    }
}
