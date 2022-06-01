package CASESTUDY.until;

import CASESTUDY.MyException.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String idVilla(String regex) {

        Boolean check = true;
        String temp;
        do {
            check = false;
            temp = scanner.nextLine();
            try {
                if (!temp.matches(regex)) {
                    check = true;

                    throw new IDVillaException("Mã dịch vụ phải đúng định dạng: SVVL-YYYY, với YYYY là các số từ 0-9, XX là:");
                }
            } catch (IDVillaException e) {
                System.out.println(e.getMessage());
            }
        }while(check);
        return temp;

    }

    public static void main(String[] args) {
        System.out.println(idVilla("(SVVL)[-][\\d]{4}"));
    }


    public static String idRoom(String regex) {
        String temp;
        Boolean check = true;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new IDRoomException("Mã dịch vụ phải đúng định dạng: SVRO-YYYY, với YYYY là các số từ 0-9, XX là:");
                } catch (IDRoomException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String idHouse(String regex) {
        String temp;
        Boolean check = true;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new IDHouseException("Mã dịch vụ phải đúng định dạng: SVHO-YYYY, với YYYY là các số từ 0-9, XX là:");
                } catch (IDHouseException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String stringException(String regex) {
        String temp;
        Boolean check = true;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new StringException("Phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                } catch (StringException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String amountException(String regex) {
        String temp;
        Boolean check = true;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new AmountException("Số lượng người tối đa phải >0 và nhỏ hơn <20");
                } catch (AmountException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String intException(String regex) {

        Boolean check = true;
        String temp;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new INTException("Chi phí thuê phải là số dương");
                } catch (INTException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String areaExecption(String regex) {
        String temp;
        Boolean check = true;
        do {
            check = false;
            temp = scanner.nextLine();
            if (!temp.matches(regex)) {
                check = true;
                try {
                    throw new AreaException("Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2");
                } catch (AreaException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
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
