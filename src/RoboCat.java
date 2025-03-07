// robots dont make mistakes

public class RoboCat extends Pet{

    public RoboCat(String nickname){
        super(Species.ROBOCAT, nickname);
    }

    public RoboCat(String nickname, int age, int tricklevel, String[] habits){
        super(Species.ROBOCAT, nickname, age, tricklevel, habits);
    }

    @Override
    public void respond(){
        System.out.println("Me-Ow, Me-Ow, i am a robotic cat!");
    }

}