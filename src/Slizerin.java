public class Slizerin extends Hogwarts{
    private int tricky; //хитрый
    private int resolute; //решительный
    private int ambition; //амбициозный
    private int resourcefulness; //находчивость
    private int thirstOfPower; //жажда власти

    public Slizerin(String name, int magicPower, int distanceTransgression, int tricky, int resolute, int ambition, int resourcefulness, int thirstOfPower) {
        super(name, magicPower, distanceTransgression);
        this.tricky = tricky;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    public void setThirstOfPower(int thirstOfPower) {
        this.thirstOfPower = thirstOfPower;
    }
}
