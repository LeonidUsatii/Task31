public class Rectangle extends Square{
    private int sideB;

    public Rectangle(int x, int y, int sideA, int sideB) {
        super(x, y, sideA);
        this.sideB = sideB;
    }

    public Rectangle(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }
}
