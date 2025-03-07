public class DomestiCat extends Pet implements Foulie{

    public DomestiCat(String nickname){
        super(Species.CAT, nickname);
    }

    public DomestiCat(String nickname, int age, int tricklevel, String[] habits){
        super(Species.CAT, nickname, age, tricklevel, habits);
    }

    @Override
    public void respond(){
        System.out.println("Meow meow, i am so curious today");
    }

    @Override
    public void foul(){
        System.out.println("I scratched the wallpapers, i'm not sorry");
    }
}
