package ss3.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        int size;
        int [] array1;
        int [] array2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size array1:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array1 = new int[size];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println('\n');
        do {
            System.out.print("Enter a size array2:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array2 = new int[size];
        int z = 0;
        while (z < array2.length) {
            System.out.print("Enter element " + (z + 1) + ": ");
            array2[z] = scanner.nextInt();
            z++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k] + "\t");
        }

        int[] array3 = new int[array1.length + array2.length];
        System.out.print('\n'+"Array 3: ");
        for (int h = 0; h < array1.length; h++) {
            array3[h] = array1[h];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        for (int value : array3) {
            System.out.print(value + " ");
        }

    }
}
