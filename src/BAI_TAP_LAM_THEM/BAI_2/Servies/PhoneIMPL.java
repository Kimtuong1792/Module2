package BAI_TAP_LAM_THEM.BAI_2.Servies;

import BAI_TAP_LAM_THEM.BAI_1.MyException.NotFoundMedicalRecordException;
import BAI_TAP_LAM_THEM.BAI_1.until.ReadAndWrite;
import BAI_TAP_LAM_THEM.BAI_2.Model.GenuinePhone;
import BAI_TAP_LAM_THEM.BAI_2.Model.HandedPhone;
import BAI_TAP_LAM_THEM.BAI_2.Model.Phone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneIMPL implements IPhone {
    Scanner scanner = new Scanner(System.in);
    static List<Phone> phoneList = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void addXT() {
        readFile();
        int id = 0;
        int max = phoneList.get(0).getID();
        if (phoneList.size() == 0) {
            id = 1;
        } else {
            for (int i = 1; i < phoneList.size(); i++) {
                if (phoneList.get(i).getID() > max) {
                    max = phoneList.get(i).getID();
                }
            }
            id = max + 1;
        }
        System.out.println("nhập tên điện thoại");
        String name = scanner.nextLine();
        System.out.println("nhập giá bán");
        Double price = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số lượng");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String product = scanner.nextLine();
        System.out.println(" nhập quốc gia");
        String country = scanner.nextLine();
        System.out.println("trạng thái");
        String range = scanner.nextLine();
        HandedPhone handedPhone = new HandedPhone(id, name, price, number,
                product, country, range);
        phoneList.add(handedPhone);
        System.out.println("thêm mới thành công");
        writeFile();
    }

    @Override
    public void addCH() {
        readFile();
        int id = 0;
        int max = phoneList.get(0).getID();
        if (phoneList.size() == 0) {
            id = 1;
        } else {
            for (int i = 1; i < phoneList.size(); i++) {
                if (phoneList.get(i).getID() > max) {
                    max = phoneList.get(i).getID();
                }
            }
            id = max + 1;
        }
        System.out.println("nhập tên điện thoại");
        String name = scanner.nextLine();
        System.out.println("nhập giá bán");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số lượng");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String product = scanner.nextLine();
        System.out.println(" nhập thời gian bảo hành");
       int insuranceTime = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập phạm vi bảo hành");
        String local = scanner.nextLine();
        GenuinePhone genuinePhone = new GenuinePhone(id, name, price, number,
                product, insuranceTime, local);
        phoneList.add(genuinePhone);
        System.out.println("thêm mới thành công");
        writeFile();
    }

    public void readFile() {
        phoneList.clear();
        List<String[]> strings = ReadAndWrite.readFile("src\\BAI_TAP_LAM_THEM\\BAI_2\\data\\mobiles.csv");
        for (String[] item : strings) {
            if (item[6].equals("Toan Quoc") || item[6].equals("Quoc Te")) {
                phoneList.add(new GenuinePhone(Integer.parseInt(item[0]), item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4], Integer.parseInt(item[5]), item[6]));
            } else {
                phoneList.add(new HandedPhone(Integer.parseInt(item[0]), item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4], item[5], item[6]));
            }
        }
    }

    public void writeFile() {
        ReadAndWrite.deleteFile("src\\BAI_TAP_LAM_THEM\\BAI_2\\data\\mobiles.csv");
        for (Phone item : phoneList) {
            String line = item.getInfor();
            ReadAndWrite.writeFile("src\\BAI_TAP_LAM_THEM\\BAI_2\\data\\mobiles.csv", line);
        }
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập mã ID cần xóa: ");
            int del = Integer.parseInt(scanner.nextLine());
            for (Phone phone: phoneList) {
                if (phone.getID()==del) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            phoneList.remove(phone);
                            writeFile();
                            display();
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Chọn lại đi!!");
                            return;
                    }
                }
            }
            try {
                throw new NotFoundMedicalRecordException("id không tồn tại");
            } catch (NotFoundMedicalRecordException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

    }

    @Override
    public void display() {
        readFile();
        for (Phone item : phoneList) {
            System.out.println(item);
        }
    }

    @Override
    public void search() {

    }
}
