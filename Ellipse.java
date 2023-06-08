public class Ellipse extends Square{
    private int sideB;

    public Ellipse(int x, int y, int sideA, int sideB) {
        super(x, y, sideA);
        this.sideB = sideB;
    }

    public Ellipse(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }
}
