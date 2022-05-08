package ss3.bai_tap;

import java.util.Scanner;

public class SumNumbersOnTheDiagonal {
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
        System.out.println("Array 2D: ");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) {
                    sum = sum + array2D[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonals of the 2D array is " + sum);
    }
}
