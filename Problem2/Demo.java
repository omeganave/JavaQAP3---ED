package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "yellow", true);

        System.out.println(S);

        System.out.println(C);
        System.out.println(C.getArea());
        System.out.println(C.getPerimeter());

        System.out.println(C1);
        System.out.println(C1.getArea());
        System.out.println(C1.getPerimeter());

        System.out.println(R);
        System.out.println(R.getArea());
        System.out.println(R.getPerimeter());

        System.out.println(R1);
        System.out.println(R1.getArea());
        System.out.println(R1.getPerimeter());

        System.out.println(Sq);
        System.out.println(Sq.getArea());
        System.out.println(Sq.getPerimeter());

        System.out.println(Sq1);
        System.out.println(Sq1.getArea());
        System.out.println(Sq1.getPerimeter());
    }
}
