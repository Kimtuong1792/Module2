package ss19.bai_tap.bai_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClassName {


    public static void main(String[] args) {
        String REGEX = "^[A|C|P]([0-9]{4})[GHIKLM]$";
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("nhập tên class cần kiểm tra");
        String check = scanner.nextLine();
        boolean checkClassName = Pattern.matches(REGEX,check);
        if(checkClassName==true){
            System.out.println("tên lớp hợp lệ");
        }else {
            System.out.println("tên lớp không hợp lệ");
        }

    }while (true);
}}
