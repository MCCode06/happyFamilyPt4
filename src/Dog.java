public class Dog extends Pet implements Foulie{

    public Dog(String nickname){
        super(Species.DOG, nickname);
    }

    public Dog(String nickname, int age, int tricklevel, String[] habits){
        super(Species.DOG, nickname, age, tricklevel, habits);
    }

    @Override
    public void respond(){
        System.out.println("Roof roof, i am barking at a wrong tree!");
    }

    @Override
    public void foul(){
        System.out.println("I broke the vase again, i'll cover it up");
    }
}