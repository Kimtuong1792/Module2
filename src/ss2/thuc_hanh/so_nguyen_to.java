package ss2.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class so_nguyen_to {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("nhập vào số cần kiểm tra");
        int number = prime.nextInt();
        if(number<2){
            System.out.println("số vừa nhập không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i<number){
                if (number%i==0){
                    check = false;
                    break;
                }i++;

        }if(check){
                System.out.println( number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
    }
}}
