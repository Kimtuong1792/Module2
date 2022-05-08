package ss3.bai_tap;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String str = "Countries output of character in string";
        Scanner input = new Scanner(System.in);
        System.out.println("input char check ");
        char check = input.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == check){
                count++;
            }
        }
        System.out.println("have "+ count +" char "+ check + " in array");
    }
}
