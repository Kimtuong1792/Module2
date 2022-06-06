package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Customer;
import CASESTUDY.Models.Employee;
import CASESTUDY.Services.CustomerService;
import CASESTUDY.until.RegexData;
import thi_thu.util.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String REGEX_BIRTHDAY = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    public List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        System.out.println("display infomration :");
        for (Customer customer : customerList) {

            System.out.println(customer.toString());

        }

    }

    @Override
    public void addNew() {
        System.out.println("nhập Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        String born = born();
        System.out.println("nhâp giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhâp CMND");
        long identity = Long.parseLong(scanner.nextLine());
        System.out.println("nhâp SĐT");
        long numberPhone = Long.parseLong(scanner.nextLine());
        System.out.println("nhâp mail");
        String email = scanner.nextLine();

        System.out.println("loại khách hàng");
        String typeOfGuest = scanner.nextLine();

        System.out.println("địa chỉt");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, born, gender, identity, numberPhone, email, typeOfGuest, address);
        customerList.add(customer);
        writeFile();


    }

    public void writeFile() {
        for (Customer item : customerList) {
            String line = item.getToString();
            ReadAndWrite.writeFile("src/CASESTUDY/data/customer.csv", line);
        }
    }

    private String born() {
        System.out.println("nhập ngày sinh");
        return RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
    }

    @Override
    public void edit() {
        System.out.println("nhập id bạn muốn sửa thông tin");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null && customerList.get(i).getId() == id) {

                System.out.println("nhâp tên");
                String name = scanner.nextLine();
                customerList.get(i).setName(name);
                System.out.println("nhâp ngày sinh");
                String born = scanner.nextLine();
                customerList.get(i).setBorn(born);
                System.out.println("nhâp giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                customerList.get(i).setGender(gender);
                System.out.println("nhâp CMND");
                long identity = Long.parseLong(scanner.nextLine());
                customerList.get(i).setIdentity(Integer.parseInt(String.valueOf(identity)));
                System.out.println("nhâp SĐT");
                long numberPhone = Long.parseLong(scanner.nextLine());
                customerList.get(i).setNumberPhone(Integer.parseInt(String.valueOf(numberPhone)));
                System.out.println("nhâp mail");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);
                System.out.println("loại khách hàng");
                String typeOfGuest = scanner.nextLine();
                customerList.get(i).setTypeOfGuest(typeOfGuest);
                System.out.println("địa chỉt");
                String address = scanner.nextLine();
                customerList.get(i).setAddress(address);

                check = false;

            }
        }
        if (check) {
            System.out.println("ID bạn nhập không tồn tại");
        }
    }

    @Override
    public void delete() {

    }
}
