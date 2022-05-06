package ss1.bai_tap;

import java.util.Scanner;

public class money {
    public static void main(String[] args){
        double VND = 23000;
        double USD;
        Scanner change = new Scanner(System.in);
        System.out.println("nhập số tiền bạn muốn chuyển đổi : ");
        USD = change.nextDouble();
        double quydoi = USD * VND;
        System.out.println("số tiển quy đổi : "+ quydoi + "VNĐ");

    }
}
