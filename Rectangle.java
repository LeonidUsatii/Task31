public class Rectangle extends Figure{

    private int sideA;
    private int sideB;

    public Rectangle(int x, int y, int sideA, int sizeB) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(int sideA, int sideB) {
        super(1, 1);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
