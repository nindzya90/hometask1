package Kiryaaa;

public abstract class Printer {

    protected String PRINT_CLASS_NAME;
    protected int PRINT_CLASS_SQUARE_NUMBER;


    public abstract boolean print();

    private void print(String PRINT_CLASS_NAME){
        this.PRINT_CLASS_NAME = PRINT_CLASS_NAME;


    }

    public int getPRINT_CLASS_SQUARE_NUMBER() {
        return PRINT_CLASS_SQUARE_NUMBER;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "PRINT_CLASS_NAME='" + PRINT_CLASS_NAME + '\'' +
                ", PRINT_CLASS_SQUARE_NUMBER=" + PRINT_CLASS_SQUARE_NUMBER +
                '}';
    }
}

