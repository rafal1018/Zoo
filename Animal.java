package Zoo;

public abstract class Animal implements Canine{

    private int id;
    private String name;
    private float weight;
    private static int COUNTER = 0;

    public Animal( String name, float weight) {
        this.id = ++COUNTER;
        this.name = name;
        this.weight =weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public int getId() {
        return id;
    }

    abstract public int length();
}
