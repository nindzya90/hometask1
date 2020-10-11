package practice;

public class Cat {

    private final String name;
    private final int appetite;

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Non-static block");
    }



    public Cat(String name, int appetite) {
        System.out.println("constructor block");
        this.name = name;
        this.appetite = appetite;
    }

    public String getName(){
        return name;
    }
    public int getAppetite(){
        return appetite;
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);

    }

}
