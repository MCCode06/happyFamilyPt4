public final class Man extends Human {

    public Man(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Man(String name, String surname, int age, int iq, String[][] schedule) {
        super(name, surname, age, iq, schedule);
    }

    @Override
    public void greetPet() {
        if (getFamily() != null && getFamily().getPet() != null) {
            Pet pet = getFamily().getPet();
            System.out.println("Hello there, my galaxy destroyer " + pet.getNickname());
        } else System.out.println("I dont own a pet, cuz i'm a man");
    }

    public void driveCar() {
        System.out.println("I can drive a car (even when i am not completely sober)");
    }

    public void watchTV() {
        System.out.println("DON'T TURN IT OFF, I AM WATCHING IT!!!");
    }

}
