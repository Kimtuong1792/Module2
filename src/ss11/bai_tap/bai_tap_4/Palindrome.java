package ss11.bai_tap.bai_tap_4;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] array = inputString.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (String s : array) {
            stack.push(s);
            queue.add(s);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean flag = false;
        while (!(stack.isEmpty())) {
            if (stack.pop().equals(queue.poll())) {
                flag = true;
            } else {
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println("Đây là chuỗi palindrome.");
        } else {
            System.out.println("Đây không phải là chuỗi palindrome ");
        }
    }
}




