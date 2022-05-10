package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 7, 9, 2, 6, 12, 3, 5, 78, 98};

        Scanner input = new Scanner(System.in);
        System.out.print( "mảng ban đầu:    ");
        for (int item : array) {
            System.out.print(item + "\t");
        }
        System.out.println('\n');

        System.out.println("nhập số cần chèn ");
        int x = input.nextInt();

        System.out.println("nhập vị trí cần chèn");
        int index = input.nextInt();
        if (index == -1 || index > array.length) {
            System.out.println("không chèn được phần tử vào mảng");

        }
        for (int i = 0; i < array.length; i++) {
            array[index] = x;
        }
        System.out.println("mảng mới " + Arrays.toString(array));
    }
}
