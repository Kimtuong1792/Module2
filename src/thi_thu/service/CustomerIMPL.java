package thi_thu.service;

import thi_thu.model.CustomerInternational;
import thi_thu.model.CustomerVN;
import thi_thu.util.ReadAndWrite;
import thi_thu.util.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerIMPL implements Customer {
    public final String REGEX_KVN = "(KHVN)[-][\\d]{5}";
    public final String REGEX_KNN = "(KHNN)[-][\\d]{5}";
    Scanner scanner = new Scanner(System.in);
    List<String[]> list = new ArrayList<>();
    List<String[]> listLk = new ArrayList<>();
    List<CustomerVN> customerVNList = new ArrayList<>();
    List<CustomerInternational> customerInternationalList = new ArrayList<>();

    private String idCodeVN() {
        System.out.println(" nhập mã khách hàng theo định dạng: KHVN-XXXXX");
        return Regex.regexStr(scanner.nextLine(), REGEX_KVN, "Mã khách hàng VN: KHVN-XXXXX");
    }

    private String idCodeNN() {
        System.out.println("nhập mã khách hàng");
        return Regex.regexStr(scanner.nextLine(), REGEX_KNN, "Mã khách hàng NN: KHNN-XXXXX ");
    }

    @Override
    public void addNewVN() {
        String idCode = idCodeVN();
        System.out.println("nhập tên khách hàng");
        String name = scanner.nextLine();
        String typeCustomer = typeCustomer();
        System.out.println("nhập định mức tiêu thụ");
        Double consumption = Double.parseDouble(scanner.nextLine());
        CustomerVN customerVN = new CustomerVN(idCode, name, typeCustomer, consumption);
        customerVNList.add(customerVN);
        writeFile();
        System.out.println("thêm mới thành công");
    }

    public String typeCustomer() {
        List<String[]> list = ReadAndWrite.readFile("src/thi_thu/data/loại khach.csv");
        System.out.println("nhập loại khách hàng ");
        System.out.println(" 1: Sinh hoạt");
        System.out.println(" 2: Kinh doanh ");
        System.out.println(" 3: Sản xuất ");
        String type = scanner.nextLine();
        String types = null;
        switch (type) {
            case "1":
                type = "LKH-001";
                break;
            case "2":
                type = "LKH-002";
                break;
            case "3":
                type = "LKH-003";
                break;
            default:
                System.out.println("nhập lại từ 1-3");
        }

        for (String[] item : list) {
            if (type.equals(item[0])) {
                types = item[1];
            }
        }
        return types;
    }

    public void writeFile() {
        for (CustomerVN customer : customerVNList) {
            String line = customer.getToString();
            ReadAndWrite.writeFile("src/thi_thu/data/khanhHang.csv", line);
        }
    }

    @Override
    public void addNewInternational() {
        //list = ReadAndWrite.readFile("src/thi_thu/data/khanhHang.csv");
//        for (String[] item : list) {
//            CustomerInternational customerInternational = new CustomerInternational(item[0], item[1], item[2]);
//            customerInternationalList.add(customerInternational);
//        }
        String idCode = idCodeNN();
        System.out.println("nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println(" nhập quốc tịch");
        String country = scanner.nextLine();

        CustomerInternational customerInternational = new CustomerInternational(idCode, name, country);
        customerInternationalList.add(customerInternational);
        writeFileNN();
        System.out.println("thêm mới thành công");
    }

    public void writeFileNN() {
        for (CustomerInternational customer : customerInternationalList) {
            String line = customer.getToString();
            ReadAndWrite.writeFile("src/thi_thu/data/khanhHang.csv", line);
        }
    }
    // String line = "";
//        for (int i = 0; i < customerInternationalList.size(); i++) {
//            line += customerInternationalList.get(i).getIdCode() + "," +
//                    customerInternationalList.get(i).getName() + "," +
//                    customerInternationalList.get(i).getCountry() + "," + "\n";
//        }
    //  ReadAndWrite.writeFile("src/thi_thu/data/khanhHang.csv", line);


    public void readFiles() {
        List<String[]> list = ReadAndWrite.readFile("src/thi_thu/data/khanhHang.csv");
        //customerVNList.clear();
        //customerInternationalList.clear();
        for (String[] item : list) {
            if (item[0].contains("KHNN")) {
                CustomerInternational foreignCustomer = new CustomerInternational(item[0], item[1], item[2]);
                // customerInternationalLi st.add(foreignCustomer);
                customerInternationalList.add(foreignCustomer);
            } else {
                CustomerVN customerVietNam = new CustomerVN(item[0], item[1], item[2], Double.parseDouble(item[3]));
                customerVNList.add(customerVietNam);
            }
        }
    }

    @Override
    public void display() {
        readFiles();

        for (CustomerVN item : customerVNList
        ) {
            System.out.println(item);

        }
        for (CustomerInternational item :
                customerInternationalList) {
            System.out.println(item);

        }

    }

    @Override
    public void search() {
        readFiles();
        System.out.println("nhập tên cần tìm kiếm");
        String name = scanner.nextLine();
        for (int i = 0; i < customerVNList.size(); i++) {
            if (customerVNList.get(i).getName().contains(name)) {
                System.out.println(customerVNList.get(i));
            }

        }
        for (int i = 0; i < customerInternationalList.size(); i++) {
            if (customerInternationalList.get(i).getName().contains(name)) {
                System.out.println(customerInternationalList.get(i));
            }
        }

    }
}
