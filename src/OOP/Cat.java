package OOP;


public class Cat extends Animal {

    public static final int DEFAULT_MAX_RUN_DISTANCE = 200;
    public static final int DEFAULT_MAX_JUMP_HEIGHT = 2;
    public static final int DEFAULT_MAX_SWIM_DISTANCE = 0;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight, DEFAULT_MAX_SWIM_DISTANCE);
    }

    public Cat(){
        this(DEFAULT_MAX_RUN_DISTANCE,DEFAULT_MAX_JUMP_HEIGHT);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("OOP.Animal.Cat can running distance %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }
        System.out.printf("OOP.Animal.Cat cant running distance %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }
    @Override
    public boolean jump(int height) {
        if(this.maxJumpHeight >= height){
            System.out.printf("OOP.Animal.Cat can jumping %d. Max = %d%n", height , maxJumpHeight);
            return true;
        }
        System.out.printf("OOP.Animal.Cat cant jumping %d. Max = %d%n", height, maxJumpHeight);
        return false;
    }


    public boolean swim(int distance) {
        System.out.println("Cats cant swim");
        return false;
    }
}



