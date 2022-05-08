package ss3.bai_tap;

import java.util.Scanner;

public class GreatestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the matrix");
        int row = Integer.parseInt(input.nextLine());
        System.out.println("enter the matrix height");
        int height = Integer.parseInt(input.nextLine());
        int[][] array2D = new int[row][height];
        for (int i = 0; i < row; i++) {
            array2D[i] = new int[height];
            for (int j = 0; j < height; j++) {
                System.out.print("enter element at position " + i + "-" + j + ": ");
                array2D[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        int max = array2D[0][0];
        int indexI = 0;
        int indexJ = 0;
        System.out.println("Array 2D: ");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                    indexI = i;
                    indexJ = j;
                }
                System.out.print(array2D[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("The largest element is " + max + ", in position " + indexI + "-" + indexJ);
    }

}
