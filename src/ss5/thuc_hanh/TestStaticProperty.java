package ss5.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda 3","Salacity 3");
        System.out.println(Car.numberOfCars);
        Car honda = new Car("kia","kia morning");
        System.out.println(Car.numberOfCars);
    }
}
