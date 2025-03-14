
import java.util.Arrays;
import java.util.Objects;
import java.lang.ref.Cleaner;

public abstract class Pet {

    private static final Cleaner CLEANER = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    public Runnable finalizer() {
        return () -> {
            try {
                System.out.println("Finalizer initiated...");
            } catch (Throwable e) {
                System.out.println("Exception in finalizer: " + e.getMessage());
                throw e;
            } finally {
                System.out.println("Pet is finalized.");
            }
        };
    }

    static {
        System.out.println("Pet class is loaded");
    }

    {
        System.out.println("Pet object is created");
    }


    private Species species;
    private String nickname;
    private String[] habits;
    private int age;
    private int trickLevel;

    public Pet(String nickname) {
        this.species = Species.UNKNOWN; // as default
        this.nickname = nickname;
        cleanable = CLEANER.register(this, this.finalizer());
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        cleanable = CLEANER.register(this, this.finalizer());
    }


    public void eat(){System.out.println("I am devouring smth...");}

    public abstract void respond();


    // Setters
    protected void setSpecies(Species species) {  // setSpecies should only be used by child classes
        this.species = species;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    // Getters
    public Species getSpecies() {
        return species;
    }
    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    public String[] getHabits() {
        return habits;
    }


    @Override
    public String toString() {
        String habitsStr = Arrays.toString(habits);
        return String.format("{Pet: %s, nickname = '%s', age = %d, trickLevel = %d, habits = %s, canFly = %b, numberOfLegs = %d, hasFur = %b}",
                species, nickname, age, trickLevel, habitsStr, species.getCanFly(), species.getNumberOfLegs(), species.hasFur());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (! (obj instanceof Pet)) return false;
        Pet pet = (Pet) obj;
        if (!Objects.equals(species, pet.species)) return false;
        if (age != pet.age) return false;
        return (Objects.equals(nickname, pet.nickname));
    }

    @Override
    public int hashCode() {
        int result = species.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + age;
        return result;
    }

}

