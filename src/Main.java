import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish("Nemo");
        DomestiCat cat = new DomestiCat("Mesi");
        Dog dog = new Dog("Qazo");
        RoboCat roboCat = new RoboCat("Ronaldo");


        Man man = new Man("John", "Doe", 1980);
        Woman woman = new Woman("Jane", "Doe", 1985);
        Family family = new Family(man, woman);

        family.setPet(dog);
        man.greetPet();
        woman.greetPet();
        man.driveCar();
        woman.driveCar();
        man.watchTV();
        woman.dishWasher();


//        fish.eat();
//        fish.respond();
//
//        cat.eat();
//        cat.respond();
//        cat.foul();
//
//        dog.eat();
//        dog.respond();
//        dog.foul();
//
//        roboCat.eat();
//        roboCat.respond();


//
//
//        System.gc();




    }
}
