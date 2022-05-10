package ss2.bai_tap;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        int number = 100;
        boolean sntFlg = true;
        for (int i = 2; i < number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sntFlg = false;
                    break;
                }
            }
            if (sntFlg) {
                System.out.println("Số nguyên tố : " + i );
            }
        }
    }
}
