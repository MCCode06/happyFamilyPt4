public class Fish extends Pet{

    public Fish(String nickname){
        super(Species.FISH, nickname);
    }

    public Fish(String nickname, int age, int tricklevel, String[] habits){
        super(Species.FISH, nickname, age, tricklevel, habits);
    }

    @Override
    public void respond(){
        System.out.println("Look here, i am fishing!");
    }
}
