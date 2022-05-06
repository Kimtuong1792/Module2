package ss2.thuc_hanh;

import java.util.Scanner;

public class tinh_lai_vay {
    public static void main(String[] args) {
        Scanner  interest = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        System.out.println("nhập số tiền gửi");
        money = interest.nextDouble();
        System.out.println("nhập số tháng gửi");
        month = interest.nextInt();
        System.out.println("nhập lãi suất ");
        rate = interest.nextDouble();
        double totalInterest = 0.0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (rate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}
