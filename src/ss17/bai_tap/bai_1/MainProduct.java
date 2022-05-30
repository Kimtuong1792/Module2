package ss17.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    public Scanner scanner = new Scanner(System.in);
    public List<Product> productList = new ArrayList<>();

    public void writeFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public void addNew() {

        System.out.println("nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("nhâp tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String producer = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập các mô tả khác");
        String description = scanner.nextLine();
        productList.add(new Product(code, name, producer, price, description));
        writeFile("src/ss17/bai_tap/bai_2/productlist.csv", productList);
        productList = readFile("src/ss17/bai_tap/bai_2/productlist.csv");
    }

    public void display() {
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public void search() {
        System.out.println(" input name your search : ");
        String check = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (check.contains(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            } else {
                System.out.println("don't have on productlist");
            }
        }

    }

    public void main(String[] args) {
        do {
            System.out.println(" 1. add new prduct");
            System.out.println(" 2. display productlist ");
            System.out.println(" 3. search information");
            System.out.println(" 4. exit ");
            System.out.println(" your choose : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNew();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);
    }
}
