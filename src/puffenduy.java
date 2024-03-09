public class puffenduy extends hogwarts {
    private int hardworking; //трудолюбивый
    private int right; //верный
    private int honest; //честный

    public puffenduy(String name, int magicPower, int distanceTransgression, int hardworking, int right, int honest) {
        super(name, magicPower, distanceTransgression);
        this.hardworking = hardworking;
        this.right = right;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
