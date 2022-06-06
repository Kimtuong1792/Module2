package BAI_TAP_LAM_THEM.BAI_1.View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public void time() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate starDay = LocalDate.parse(scanner.nextLine(), formatter);//yyyy-MM-dd
            LocalDate endDay = LocalDate.parse(scanner.nextLine(), formatter);//yyyy-MM-dd

            if (starDay.isAfter(endDay)) {
                System.out.println("ngày nhập viện phải lớn hơn ngày ra viện");
            }

            System.out.println();
            //System.out.println(formatter.format(localDate1));
        } catch (DateTimeParseException e) {
            System.out.println("Sai định dạng rồi!!");
        }


    }
}
