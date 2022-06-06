package BAI_TAP_LAM_THEM.BAI_1.SERVICES;

import BAI_TAP_LAM_THEM.BAI_1.MODEL.Normal;
import BAI_TAP_LAM_THEM.BAI_1.MODEL.Patient;
import BAI_TAP_LAM_THEM.BAI_1.MODEL.VIP;
import BAI_TAP_LAM_THEM.BAI_1.MyException.NotFoundMedicalRecordException;
import BAI_TAP_LAM_THEM.BAI_1.until.DataRegex;
import BAI_TAP_LAM_THEM.BAI_1.until.ReadAndWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientIMPL implements IPatient {
    Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID_BA = "BA[-][\\d]{3}";
    public static final String REGEX_ID_BN = "BN[-][\\d]{3}";

    static List<Patient> patientList = new ArrayList<>();

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String inputBA() {
        System.out.println("nhập mã bệnh án");
        System.out.println("Mã bệnh án phải đúng định dạng BA-XXX, với XXX là các kí tự số.");

        return DataRegex.idBA(REGEX_ID_BA);
    }

    public String inputBN() {
        System.out.println("nhập mã bệnh nhân");
        System.out.println("Mã bệnh nhân phải đúng định dạng BN-XXX, với XXX là các kí tự số.");
        return DataRegex.idBN(REGEX_ID_BN);
    }
//
//    public void time() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        try {
//            LocalDate starDay = LocalDate.parse(scanner.nextLine(), formatter);//yyyy-MM-dd
//            LocalDate endDay = LocalDate.parse(scanner.nextLine(), formatter);//yyyy-MM-dd
//
//            if (starDay.isAfter(endDay)) {
//                System.out.println("ngày nhập viện phải lớn hơn ngày ra viện");
//            }
//
//            System.out.println();
//            //System.out.println(formatter.format(localDate1));
//        } catch (DateTimeParseException e) {
//            System.out.println("Sai định dạng rồi!!");
//        }
//
//    }

    public static void readFile() {

        patientList.clear();
        List<String[]> strings = ReadAndWrite.readFile("D:\\CODEGYM\\Module2\\src\\BAI_TAP_LAM_THEM\\BAI_1\\data\\medical_records.csv");
        for (String[] item : strings) {
            if (item.length == 8) {
                patientList.add(new Normal(item[0], item[1], item[2], item[3], LocalDate.parse(item[4]), LocalDate.parse(item[5]), item[6], Double.parseDouble(item[7])));
            } else if (item.length == 9) {
                patientList.add(new VIP(item[0], item[1], item[2], item[3], LocalDate.parse(item[4]), LocalDate.parse(item[5]), item[6], item[7], LocalDate.parse(item[8])));
            }
        }
    }

    public void writeFile() {
        ReadAndWrite.deleteFile("src/BAI_TAP_LAM_THEM/BAI_1/data/medical_records.csv");
        for (Patient normal : patientList) {
            String line = normal.getInFor();
            ReadAndWrite.writeFile("src/BAI_TAP_LAM_THEM/BAI_1/data/medical_records.csv", line);
        }
    }
//    public void writeFileVIP() {
//        for (Patient vip : patientList) {
//            String line = vip.toString();
//            ReadAndWrite.writeFile("src/BAI_TAP_LAM_THEM/BAI_1/data/medical_records.csv", line);
//        }
//    }

    @Override
    public void addNewNomal() {
        readFile();
        String id = "";
        //int max;
        if (patientList.size() == 0) {
            id = "1";
        } else {
            id = "" + (Integer.parseInt(patientList.get(patientList.size() - 1).getId()) + 1);
        }
        String IDBA = inputBA();
        String IDBN = inputBN();
        System.out.println("nhập tên bệnh nhân");
        String name = scanner.nextLine();
        System.out.println("nhập thời gian nhập viện");

        LocalDate dayStar = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println("nhập thời gian xuất viện");
        LocalDate dayEnd = null;
        boolean flag = true;
        do {
            flag = false;
            dayEnd = LocalDate.parse(scanner.nextLine(), formatter);
            if (dayStar.isAfter(dayEnd)) {
                System.out.println("ngày xuất viện phải lớn hơn ngày nhập viện");
            flag = true;
            }
        } while (flag);

        System.out.println(" nhập lí do nhập viện");
        String leave = scanner.nextLine();
        System.out.println("nhập chi phí nằm viện");
        Double price = Double.parseDouble(scanner.nextLine());
        Normal normal = new Normal(id, IDBA, IDBN, name, dayStar, dayEnd, leave, price);
        patientList.add(normal);
        System.out.println("Thêm mới thành công");
        writeFile();
    }

//    public static void main(String[] args) {
//        readFile();
//        System.out.println(patientList.get(patientList.size()-1));
//    }

    @Override
    public void addNewVIP() {
        readFile();
        String id = "";
        //int max;
        if (patientList.size() == 0) {
            id = "1";
        } else {
            id = "" + (Integer.parseInt(patientList.get(patientList.size() - 1).getId()) + 1);
        }
        String IDBA = inputBA();
        String IDBN = inputBN();
        System.out.println("nhập tên bệnh nhân");
        String name = scanner.nextLine();
        System.out.println("nhập thời gian nhập viện");
        boolean check = true;
        LocalDate dayStar = null;
        do {

            try {
                dayStar = LocalDate.parse(scanner.nextLine(),formatter);
                check = false;
            }catch (DateTimeParseException e){
                System.out.println("nhập theo định dạng dd/MM/yyyy");
                check= true;
            }
        }while (check);


        System.out.println("nhập thời gian xuất viện");
        LocalDate dayEnd = null;
        boolean flag = true;
        do {
            flag = false;
            dayEnd = LocalDate.parse(scanner.nextLine(), formatter);
            if (dayStar.isAfter(dayEnd)) {
                System.out.println("ngày xuất viện phải lớn hơn ngày nhập viện");
                flag = true;
            }
        } while (flag);
        System.out.println(" nhập lí do nhập viện");
        String leave = scanner.nextLine();
        System.out.println("nhập loại VIP");
        System.out.println("1. VIP I");
        System.out.println("2. VIP II");
        System.out.println("3. VIP III");
        int choose = Integer.parseInt(scanner.nextLine());
        String type = null;
        switch (choose) {
            case 1:
                type = "VIP I";
                break;
            case 2:
                type = "VIP II";
                break;
            case 3:
                type = "VIP III";
                break;
            default:
                System.out.println("nhập lại 1,2 hoặc 3");
        }
        System.out.println("nhập thời hạn VIP");
        LocalDate vipTerm = LocalDate.parse(scanner.nextLine(),formatter);
        VIP vip = new VIP(id, IDBA, IDBN, name, dayStar, dayEnd, leave, type, vipTerm);
        patientList.add(vip);
        System.out.println("Thêm mới thành công");
        writeFile();
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập mã bệnh án cần xóa: ");
            String inputMedicalRecordCode = scanner.nextLine();
            for (Patient patient : patientList) {
                if (patient.getNumberPatient().equals(inputMedicalRecordCode)) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            patientList.remove(patient);
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
                throw new NotFoundMedicalRecordException("Bệnh án không tồn tại");
            } catch (NotFoundMedicalRecordException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    @Override
    public void display() {
        readFile();
        for (Patient item : patientList) {
            System.out.println(item);
        }
    }
}
