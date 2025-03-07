public class Fish extends Pet{

    public Fish(String nickname){
        super(nickname);
        setSpecies(Species.FISH);
    }

    public Fish(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void respond(){
        System.out.println("Look here, i am fishing!");
    }
}
