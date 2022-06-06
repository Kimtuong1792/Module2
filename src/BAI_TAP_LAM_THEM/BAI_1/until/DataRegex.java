package BAI_TAP_LAM_THEM.BAI_1.until;

import CASESTUDY.MyException.AgeException;
import CASESTUDY.MyException.IDVillaException;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataRegex {
    static Scanner scanner = new Scanner(System.in);
    public static String idBA(String regex) {

        Boolean check = true;
        String temp;
        do {
            check = false;
            temp = scanner.nextLine();
            try {
                if (!temp.matches(regex)) {
                    check = true;

                    throw new IDVillaException("✔Mã bệnh án phải đúng định dạng BA-XXX, với XXX là các kí tự số.");
                }
            } catch (IDVillaException e) {
                System.out.println(e.getMessage());
            }
        }while(check);
        return temp;

    }
    public static String idBN(String regex) {

        Boolean check = true;
        String temp;
        do {
            check = false;
            temp = scanner.nextLine();
            try {
                if (!temp.matches(regex)) {
                    check = true;

                    throw new IDVillaException("✔Mã bệnh nhân phải đúng định dạng BN-XXX, với XXX là các kí tự số.");
                }
            } catch (IDVillaException e) {
                System.out.println(e.getMessage());
            }
        }while(check);
        return temp;

    }

    public static String time(String regex) {

        Boolean check = true;
        String temp;
        do {
            check = false;
            temp = scanner.nextLine();
            try {
                if (!temp.matches(regex)) {
                    check = true;

                    throw new IDVillaException("phải đúng định dạng dd/MM/yyyy");
                }
            } catch (IDVillaException e) {
                System.out.println(e.getMessage());
            }
        }while(check);
        return temp;

    }
    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                    LocalDate age = LocalDate.parse(temp, formatter);
//                    LocalDate now = LocalDate.now();
//                    int current = Period.between(age, now).getYears();
//                    if (current < 100 && current > 18) {
//                        check = false;
//                    } else {
//                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
//                    }
              } else {
                 throw new AgeException("Định dạng nhập vào không đúng");
               }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

}
