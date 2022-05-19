package ss11.bai_tap.bai_tap_5;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra");
        String sym = scanner.nextLine();
        String[] array = sym.split("");
        boolean flag = true;
        for (String s : array) {
            if (s.equals("(")) {
                bStack.push(s);
            } else if (s.equals(")")) {
                if (bStack.isEmpty()) {
                    flag = false;
                } else {
                    String left = bStack.peek();
                    if (left.equals("(")) {
                        bStack.pop();
                    }
                }
            }

        }
        if (bStack.size() > 0) {
            flag = false;
        }
        if (flag) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
    }
}
