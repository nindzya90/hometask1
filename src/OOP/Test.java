package OOP;

import OOP.Animal;

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Animal[] participants = prepareParticipants();
        playGame(participants);

    }
    private static Animal[] prepareParticipants (){
        return new Animal[]{
                new Cat(),
                new Dog(),
                new Cat(300,3),
                new Dog(1000,2,100)
        };
    }

    private static void playGame(Animal[] participants){
        Random random = new Random();

        for(Animal participant : participants){
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.jump(random.nextInt(5)));
            System.out.println(participant.swim(random.nextInt(100)));
            System.out.println();
        }
    }

}
