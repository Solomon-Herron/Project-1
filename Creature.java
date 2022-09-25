import java.util.ArrayList;

public abstract class Creature {
    public static char icon;
    int breedTimer;
    static ArrayList<Creature> creatureList = new ArrayList<>(0);
    boolean hasMoved = false;


    public Creature() {
        creatureList.add(this);
    }

    abstract public String move();

    abstract public String breed();






}
