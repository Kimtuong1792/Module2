package ss4.bai_tap;

public class FanTest {
    public static void main(String[] args) {
        Fan.Fan1 fan1 = new Fan.Fan1(3,true,10,"yellow");
        System.out.println("quạt thứ nhất: " + fan1);
        Fan.Fan1 fan2 = new Fan.Fan1(2,false,5,"blue");
        System.out.println("quạt thứ 2: "+ fan2);
    }
}
