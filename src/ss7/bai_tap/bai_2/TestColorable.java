package ss7.bai_tap.bai_2;

public class TestColorable {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,6);
        Circle circle = new Circle(2,"red",true);
        Square square = new Square(4);
        Shape[] array = {rectangle,circle,square};
        for (Shape elemennt : array) {
            System.out.println(elemennt.getArea());
            if (elemennt instanceof Rectangle) {
                elemennt.howToColor();
            }
        }
    }
}
