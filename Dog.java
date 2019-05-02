package Zoo;

public class Dog extends Animal implements Canine{

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public String  bark() {
        return "bark bark bark";
    }

    public void sitPretty(){
        System.out.println("Sits pretty");
    }
}
