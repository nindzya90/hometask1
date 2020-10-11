package OOP;



public class Dog extends Animal {

    public static final int DEFAULT_MAX_RUN_DISTANCE = 500;
    public static final int DEFAULT_MAX_JUMP_HEIGHT = 1;
    public static final int DEFAULT_MAX_SWIM_DISTANCE = 10;



    public Dog(int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        super(maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    public Dog(){
        this(DEFAULT_MAX_RUN_DISTANCE,DEFAULT_MAX_JUMP_HEIGHT,DEFAULT_MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if(this.maxRunDistance >= distance) {
            System.out.printf("Dog can running distance %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }
            System.out.printf("Dog cant running distance %d. Max = %d%n", distance, maxRunDistance);
            return false;
    }

    @Override
    public boolean jump(int height) {
        if(this.maxJumpHeight >= height){
            System.out.printf("Dog can jumping %d. Max = %d%n", height , maxJumpHeight);
            return true;
        }
        System.out.printf("Dog cant jumping %d. Max = %d%n", height, maxJumpHeight);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if(this.maxSwimDistance >= distance){
            System.out.printf("Dog can swim this distance %d. Max = %d%n", distance, maxSwimDistance);
            return true;
        }
        System.out.printf("Dog cant swim this distance %d. Max = %d%n", distance,maxSwimDistance);
        return false;


    }
}
