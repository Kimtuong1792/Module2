package ss11.bai_tap.bai_tap_3;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số cần chuyển đổi");
        int number = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        while(number > 0){
            int binary = number%2;
            number = number/2;
            stack.push(binary);
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }



    }
}
