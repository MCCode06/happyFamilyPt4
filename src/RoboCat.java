// robots dont make mistakes

public class RoboCat extends Pet{

    public RoboCat(String nickname){
        super(nickname);
        setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond(){
        System.out.println("Me-Ow, Me-Ow, i am a robotic cat!");
    }

}