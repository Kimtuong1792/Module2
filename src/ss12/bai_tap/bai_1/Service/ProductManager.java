package ss12.bai_tap.bai_1.Service;

import ss12.bai_tap.bai_1.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("Applewatch S4", 1, 100, 10, "Apple"));
        productList.add(new Product("Applewatch S5", 2, 110, 10, "Apple"));
        productList.add(new Product("Applewatch S6", 3, 120, 10, "Apple"));
        productList.add(new Product("Applewatch S7", 4, 130, 10, "Apple"));
        productList.add(new Product("Applewatch S8", 5, 140, 10, "Apple"));

    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập Số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();

        int id = productList.get(productList.size() - 1).getId() + 1;
        Product product = new Product(name, id, price, amount, production);
        productList.add(product);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void deleteProduct() {
        int temp = 0;
        System.out.println("Nhập id muốn xóa");
        int inputDel = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) != null && productList.get(i).getId() == inputDel) {
                flag = true;
                temp=i;
                break;
            }

        }
        if (flag) {
            productList.remove(temp);
            System.out.println("xoá ok");

        } else {
            System.out.println("tìm ko thấy");
        }
    }

    @Override
    public void updateProduct() {
        System.out.println("Vị trí bạn muốn sửa");
        int up = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) != null && productList.get(i).getId() == up) {
                flag = true;
                index = i;
            }

        }
        if (flag) {
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập giá");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số lượng");
            int amount = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập nhà sản xuất");
            String production = scanner.nextLine();
            productList.set(index, new Product(name, up, price, amount, production));
            System.out.println("Sửa thành công");

        } else {
            System.out.println("id nhập không đúng");
        }

    }

    @Override
    public void search() {
        int countCheck = 0;
        System.out.println("nhập tên cần tìm kiếm");
        String check = scanner.nextLine();
        for (Product item : productList) {
            if (item != null && (item.getName().contains(check))) {
                System.out.println(item);
                countCheck++;
            }

        }
        System.out.println("số lượng tìm thấy: " + countCheck);

    }
}
