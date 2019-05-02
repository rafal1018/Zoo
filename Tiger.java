package Zoo;

public class Tiger extends Animal {

    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public int length() {
        return clawLength;
    }

    @Override
    public String bark() {
        return null;
    }
}
