package Zoo;

public class Bear extends Animal{

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public int length() {
        return furLength;
    }

    @Override
    public String bark() {
        return null;
    }
}
