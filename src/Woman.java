public final class Woman extends Human {

    public Woman(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Woman(String name, String surname, int age, int iq, String[][] schedule) {
        super(name, surname, age, iq, schedule);
    }

    @Override
    public void greetPet() {
        if (getFamily() != null && getFamily().getPet() != null) {
            Pet pet = getFamily().getPet();
            System.out.println("Hello there, my cutie patootie " + pet.getNickname());
        } else System.out.println("I dont own a pet, cuz no one but me can live with me");
    }

    public void driveCar() {
        System.out.println("I can't drive a car");
    }

    public void dishWasher() {
        System.out.println("I am doing the dishes");
    }
}
