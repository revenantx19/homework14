public class Hogwarts {
    private int magicPower;
    private int distanceTransgression;
    private String name;

    public Hogwarts(String name, int magicPower, int distanceTransgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.distanceTransgression = distanceTransgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
