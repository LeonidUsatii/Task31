public class Square extends Figure{
    private final int sideA;

    public Square(int x, int y, int sideA) {
        super(x, y);
        this.sideA = sideA;
    }

    public Square(int sideA) {
        super(1, 1);
        this.sideA = sideA;
    }

    public Square() {
        super(1, 1);
        this.sideA = 1;
    }

    public int getSideA() {
        return sideA;
    }
}
