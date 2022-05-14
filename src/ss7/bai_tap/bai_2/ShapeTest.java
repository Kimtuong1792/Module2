package ss7.bai_tap.bai_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public void howToColor() {

            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);
        shape = new Shape("red", false) {
            @Override
            public void howToColor() {

            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);

    }
}
