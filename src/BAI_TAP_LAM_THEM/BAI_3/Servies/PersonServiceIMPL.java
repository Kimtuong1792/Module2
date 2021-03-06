package BAI_TAP_LAM_THEM.BAI_3.Servies;

import BAI_TAP_LAM_THEM.BAI_3.Model.ManagementStaff;
import BAI_TAP_LAM_THEM.BAI_3.Model.Person;
import BAI_TAP_LAM_THEM.BAI_3.Model.ProductionStaff;
import BAI_TAP_LAM_THEM.BAI_3.util.NotFoundEmployeeException;
import BAI_TAP_LAM_THEM.BAI_3.util.ReadAndWrite;
import BAI_TAP_LAM_THEM.BAI_3.util.RegexData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceIMPL implements IPersonService {
    static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new ArrayList<>();
    public static final String REGEX_TIME = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String REGEX_MANAGER = "^NVQL-\\d{3}$";
    public static final String REGEX_PRODUCE = "^NVSX-\\d{3}$";
    public static final String REGEX_POSITIVE_NUMBER = "[1-9][0-9]*";
    public static final String  REGEX_STR = "[A-Z][a-z]+";


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void readFile() {
        personList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv");
        for (String[] item : listStr) {
            if (item[1].startsWith("NVQL")) {
                personList.add(new ManagementStaff(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]),
                        Double.parseDouble(item[6])));
            } else if (item[1].contains("NVSX")){
                personList.add(new ProductionStaff(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Integer.parseInt(item[5]),
                        Double.parseDouble(item[6])));
            }
        }
    }
    public void writeFile() {
        ReadAndWrite.deleteFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv");
        for (Person item : personList) {
            String line = item.getInFor();
            ReadAndWrite.writeFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv", line);
        }
    }

    @Override
    public void addNewProduct() {
        readFile();

//        int id = personList.get(personList.size()-1).getId() + 1;

        int id = 1;
        int max = id;

        for (Person person : personList) {
            if (max < person.getId()) {
                max = person.getId();
            }
        }

        id = max + 1;
//        if (personList.size() == 0) {
//            id = 1;
//        } else {
//            for (int i = 0; i < personList.size(); i++) {
//                if (personList.get(i).getId() > max) {
//                    max = personList.get(i).getId();
//                }
//            }
//            id = max + 1;
//        }

        System.out.println("Nh???p m?? nh??n vi??n");
        String employeeCode = RegexData.regexStr(scanner.nextLine(),REGEX_PRODUCE,"Nh???p theo ?????nh d???ng NVSX-XXX");

        System.out.println("Nh???p h??? v?? t??n");
        String name = RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Nh???p ch??? in hoa ?????u, kh??ng ???????c tr??ng" );

        System.out.println("Nh???p ng??y th??ng n??m sinh");
       LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(),REGEX_TIME),formatter);




            System.out.println("Nh???p ?????a ch???");
            String address = scanner.nextLine();


        System.out.println("Nh???p s??? s???n ph???m");
        int productNumber = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Gi?? tr??? nh???p ph???i l???n h??n 0"));

        System.out.println("Nh???p gi??");
        double price = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Gi?? tr??? nh???p ph???i l???n h??n 0"));

        ProductionStaff productionStaff = new ProductionStaff(id, employeeCode, name,birthDay, address, productNumber, price);
        personList.add(productionStaff);
        writeFile();
        System.out.println("???? th??m m???i th??nh c??ng");

    }

    @Override
    public void addNewManagement() {
        readFile();
        int id = 1;
        int max = id;

        for (Person person : personList) {
            if (max < person.getId()) {
                max = person.getId();
            }
        }

        System.out.println("Nh???p m?? nh??n vi??n");
        String employeeCode = RegexData.regexStr(scanner.nextLine(),REGEX_MANAGER,"Nh???p theo ?????nh d???ng NVQL-XXX");

        System.out.println("Nh???p h??? v?? t??n");
        String name = scanner.nextLine();


        System.out.println("Nh???p ng??y th??ng n??m sinh");
        LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(),REGEX_TIME),formatter);

        System.out.println("Nh???p ?????a ch???");
        String address = scanner.nextLine();

        System.out.println("Nh???p l????ng c?? b???n");
        double wage = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Gi?? tr??? nh???p ph???i l???n h??n 0"));

        System.out.println("Nh???p h??? s??? l????ng");
        double coefficientsSalary = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Gi?? tr??? nh???p ph???i l???n h??n 0"));

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, birthDay, address, wage, coefficientsSalary);
        personList.add(managementStaff);
        writeFile();
        System.out.println("???? th??m m???i th??nh c??ng");

    }

    @Override
    public void display() {
        readFile();
        System.out.println("display personlist");
        for (Person item: personList) {
            System.out.println(item);
        }
    }

    @Override
    public void search() {
        readFile();
        System.out.println("Nh???p t??n mu???n t??m ki???m");
        String inputName = scanner.nextLine();
        for (Person person : personList) {
            if (person.getEmployeeCode().contains(inputName)) {
                System.out.println("T??n c???n t??m:" + person);
            }
        }
        System.out.println("Kh??ng t??m th???y t??n n??y");
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nh???p m?? nh??n vi??n c???n x??a: ");
            String inputEmployeeCode = scanner.nextLine();
            for (Person person : personList) {
                if (person.getEmployeeCode().equals(inputEmployeeCode)) {
                    System.out.println("B???n c?? mu???n x??a hay kh??ng? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            personList.remove(person);
                            writeFile();
                            display();
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Ch???n l???i ??i!!");
                            return;
                    }
                }
            }
            try {
                throw new NotFoundEmployeeException("M?? nh??n vi??n kh??ng t???n t???i");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
