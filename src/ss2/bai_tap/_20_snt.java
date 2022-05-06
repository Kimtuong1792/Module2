package ss2.bai_tap;

import java.util.Scanner;

public class _20_snt {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        int number = 2;
        int count = 0;
        int numSnt = 20;
        while (count < numSnt) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;

                System.out.println("So thư tu " + count +" :"+ number + '\n');
            }
            number++;
        }
    }
}
