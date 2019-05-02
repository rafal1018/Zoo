package Zoo;

public class Wolf extends Animal {

    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public String bark() {
        return "BARK BARK BARK";
    }

    @Override
    public int length() {
        return fangLength;
    }
}
