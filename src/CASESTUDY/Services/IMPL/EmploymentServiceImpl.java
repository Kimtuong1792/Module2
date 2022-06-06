package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Employee;
import CASESTUDY.Services.EmployeeService;
import thi_thu.model.CustomerVN;
import thi_thu.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmploymentServiceImpl implements EmployeeService {

    public List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addNew() {
        System.out.println("nhâp mail");
        String email = scanner.nextLine();

        System.out.println("nhâp trình độ học vấn");
        String level = scanner.nextLine();

        System.out.println("nhâp cấp bật");
        String location = scanner.nextLine();

        System.out.println("nhập Id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        System.out.println("nhâp ngày sinh");
        String born = scanner.nextLine();

        System.out.println("nhâp giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("nhâp lương");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("nhâp SĐT");
        long numberPhone = Long.parseLong(scanner.nextLine());

        System.out.println("nhâp CMND");
        long identity = Long.parseLong(scanner.nextLine());

        Employee employee = new Employee(id, name, born, gender, identity, numberPhone, email, level, location, salary);
        employeeList.add(employee);
        writeFile();

    }
    public void writeFile() {
        for (Employee item : employeeList) {
            String line = item.getToString();
            ReadAndWrite.writeFile("src/CASESTUDY/data/employee.csv", line);
        }
    }

    @Override
    public void edit() {

        System.out.println("nhập id bạn muốn sửa thông tin");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null && employeeList.get(i).getId() == id) {

                System.out.println("nhâp mail");
                employeeList.get(i).setEmail(scanner.nextLine());

                System.out.println("nhâp trình độ học vấn");
                employeeList.get(i).setLevel(scanner.nextLine());

                System.out.println("nhâp cấp bật");
                employeeList.get(i).setLocation(scanner.nextLine());

                System.out.println("nhâp tên");
                employeeList.get(i).setName(scanner.nextLine());

                System.out.println("nhâp ngày sinh");
                employeeList.get(i).setBorn(scanner.nextLine());

                System.out.println("nhâp giới tính");
                employeeList.get(i).setGender(scanner.nextBoolean());

                System.out.println("nhâp lương");
                employeeList.get(i).setSalary(scanner.nextInt());

                System.out.println("nhâp SĐT");
                employeeList.get(i).setNumberPhone(scanner.nextInt());

                System.out.println("nhâp CMND");
                employeeList.get(i).setIdentity(scanner.nextInt());
                check = false;
            }


        } if(check){
            System.out.println("ID bạn nhập không tồn tại");
    }

}


    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readFile("src/CASESTUDY/data/employee.csv");
        System.out.println("display infomration :");
        for (String[] item : list) {

            System.out.println(Arrays.toString(item));

        }


    }

    @Override
    public void delete() {

    }
}
