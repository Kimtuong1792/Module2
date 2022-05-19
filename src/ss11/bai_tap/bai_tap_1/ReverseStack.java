package ss11.bai_tap.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack<E> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng");
        int num = Integer.parseInt(scanner.nextLine());

        int[] array = new int[num];

        for (int j = 0; j < array.length; j++) {
            System.out.println("nhập giá trị mảng");
            int element = Integer.parseInt(scanner.nextLine());
            array[j] = element;

        }
        System.out.println(Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            System.out.println(stack.push(array[i]));
        }

        for (int i = 0; i <array.length ; i++) {
            array[i]= stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }

}
