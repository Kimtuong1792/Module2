package ss19.bai_tap.bai_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestNumberphone {
    public static void main(String[] args) {

    String REGEX = "^\\((\\d{2})\\)-\\(\\d{10}\\)$";
    Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("nhập SĐT cần kiểm tra");
        String check = scanner.nextLine();
        boolean checkNumberPhone = Pattern.matches(REGEX,check);
        if(checkNumberPhone==true){
            System.out.println(" hợp lệ");
        }else {
            System.out.println(" không hợp lệ");
        }

    }while (true);
}}
