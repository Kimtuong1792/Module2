package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        int[] array = {3, 4, 8, 1, 6, 9, 3, 6, 9, 2};
        int index = array.length - 1;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int x = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[index] = 0;
                i--;
                index--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
