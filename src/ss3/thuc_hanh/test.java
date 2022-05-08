package ss3.thuc_hanh;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Input the row :");
            int row = scanner.nextInt();
            System.out.println("Input the height :");
            int height = scanner.nextInt();
            int[][] arr = new int[row][height];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < height; j++) {
                    System.out.println("Input the value " + i + "," + j + "];");
                    arr[i][j] = scanner.nextInt();
                }

            }

            for (int i = 0; i < row; i++) {
                System.out.print("[");
                for (int j = 0; j < height; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("]");
            }
            System.out.println();
            int max = arr[0][0];
            for (int i = 0; i < row; i++) {   //In ra mảng 2 chiều
                for (int j = 0; j < height; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("Max in Tow dimensional array : " + max);
    }
}
