import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish("Nemo");
        DomestiCat cat = new DomestiCat("Mesi");
        Dog dog = new Dog("Qazo");
        RoboCat roboCat = new RoboCat("Ronaldo");


        Man man = new Man("Sanani", "Zeynalli", 2006, 150, null);
        Woman woman = new Woman("X", "Zeynalli", 2005, 112, null);
        Family family = new Family(man, woman);
        Human child = family.bornChild();
        System.out.println(child);

//        family.setPet(dog);
//        man.greetPet();
//        woman.greetPet();
//        man.driveCar();
//        woman.driveCar();
//        man.watchTV();
//        woman.dishWasher();


//        fish.eat();
//        fish.respond();
//
//        roboCat.eat();
//        roboCat.respond();
//
//        cat.eat();
//        cat.respond();
//        cat.foul();
//
//        dog.eat();
//        dog.respond();
//        dog.foul();

    }
}
