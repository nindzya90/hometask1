package Kiryaaa;

public class SquarePrinter extends Printer {


    public SquarePrinter() {
        super();
    }

    @Override
    public boolean print() {
        return false;
    }

    @Override
    public int getPRINT_CLASS_SQUARE_NUMBER() {
        return super.getPRINT_CLASS_SQUARE_NUMBER();
    }

    @Override
    public void printInfo() {
        super.printInfo();


    }

    public double resultPow() {
        var pow1 = StrictMath.pow(2, 2);
        System.out.println(pow1);
        return pow1;


    }
}
