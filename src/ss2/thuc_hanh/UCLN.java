package ss2.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhập vào số a");
        a = input.nextInt();
        System.out.println("nhập vào số b ");
        b = input.nextInt();
        b = Math.abs(b);
        a = Math.abs(a);
        if (a == 0 || b == 0) {
            System.out.println(" a và b không có ước chung");
        } else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        System.out.println("ước chung lớn nhất là : " + a);
    }

}
}
