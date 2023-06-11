public class Main {
    /*
         На основе задания в классе (Circle, Figure)
     Сделать:
     Прямоугольник (длина ширина)
     Эллипс (малый радиус, большой радиус)
     Квадрат (длина одной стороны)
     Добавить эти классы в иерархию
      */
    public static void main(String[] args) {

        Ellipse e1 = new Ellipse(2, 3, 14, 6);
        Ellipse e2 = new Ellipse(12,5);

        System.out.println("Эллипс e1 " + e1.getX() + " " + e1.getY() + " " + e1.getColor() + " " + e1.getLargeRadius() + " " + e1.getSmallRadius());
        System.out.println("Эллипс e2 " + e2.getX() + " " + e2.getY() + " " + e2.getColor() + " " + e1.getLargeRadius() + " " + e1.getSmallRadius());


        Circle c1 = new Circle(5,2,10);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle();

        System.out.println("Круг c1 " + c1.getX() + " " + c1.getY() + " " + c1.getColor() + " " + c1.getRadius());
        System.out.println("Круг c2 " + c2.getX() + " " + c2.getY() + " " + c2.getColor() + " " + c2.getRadius());
        System.out.println("Круг c3 " + c3.getX() + " " + c3.getY() + " " + c3.getColor() + " " + c3.getRadius());

        Rectangle r1 = new Rectangle(5, 3, 8, 6);
        Rectangle r2 = new Rectangle(8, 10);

        System.out.println("Прямоугольник r1 " + r1.getX() + " " + r1.getY() + " " + r1.getColor() + " " + r1.getSideA() + " " + r1.getSideB());
        System.out.println("Прямоугольник r2 " + r2.getX() + " " + r2.getY() + " " + r2.getColor() + " " + r2.getSideA());


        Square s1 = new Square(3,4, 10);
        Square s2 = new Square(5);

        System.out.println("Квадрат s1 " + s1.getX() + " " + s1.getY() + " " + s1.getColor() + " " + s1.getSideA());
        System.out.println("Квадрат s2 " + s2.getX() + " " + s2.getY() + " " + s2.getColor() + " " + s2.getSideA());

    }
}
