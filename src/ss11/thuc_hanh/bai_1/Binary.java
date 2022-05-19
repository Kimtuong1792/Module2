package ss11.thuc_hanh.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter decimal number: ");
        int num = in.nextInt();
        while (num != 0) {
            int number = num % 2;
            System.out.println(number);
            stack.push(number);

            num /= 2;
            //System.out.println(num);
        }
        //System.out.println(stack);
        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }

    }
}
