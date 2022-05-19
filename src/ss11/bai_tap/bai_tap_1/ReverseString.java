package ss11.bai_tap.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString<E> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi ");
        String str = scanner.nextLine();
        String[] mWord = str.split(" ");
        System.out.println(Arrays.toString(mWord));
        Stack<String> wstack = new Stack<>();
        for (int i = 0; i < mWord.length; i++) {
            System.out.println(wstack.push(mWord[i]));
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wstack.pop();

        }
        System.out.println(Arrays.toString(mWord));
    }
}
