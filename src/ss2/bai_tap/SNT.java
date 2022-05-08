package ss2.bai_tap;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        int number = 100;
        for (int i = 2; i < number; i++) {
            boolean sntFlg = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sntFlg = false;
                    break;
                }
            }
            if (sntFlg == true) {
                System.out.println("Số nguyên tố : " + i );
            }


        }
    }
}
