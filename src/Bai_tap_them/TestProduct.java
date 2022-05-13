package Bai_tap_them;

import java.util.Scanner;

public class TestProduct {
    public static Product[] productList = new Product[100];
    public static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    static {
        productList[0] = new Product(1, "Iphone", 1000, 10, "Apple");
        productList[1] = new Product(2, "samsungA1", 100, 10, "Samsung");
        productList[2] = new Product(3, "oppoF1", 500, 10, "Oppo");
        productList[3] = new Product(4, "IphoneX", 700, 10, "Apple");
        productList[4] = new Product(5, "Nokia", 1000, 10, "Nokia");
        count = 5;
    }

    public static void addNewProduct() {
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số lượng");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String production = scanner.nextLine();
        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }

    }

    public static void search() {
        int countCheck = 0;
        System.out.println("nhập tên cần tìm kiếm");
        String check = scanner.nextLine();
        for (Product item : productList) {
            if (item != null && (item.getName().contains(check) || item.getProduction().contains(check))) {
                System.out.println(item);
                countCheck++;
            }

        }
        System.out.println("số lượng tìm thấy: " + countCheck);

    }

    public static void deleteProduct() {
        int temp = 0;
        System.out.println("Nhập id muốn xóa");
        int inputDel = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == inputDel) {

                for (int j = i; j < productList.length && productList[j] != null; j++) {
                    productList[j] = productList[j + 1];
                }
                System.out.println("Xoá thành công");
                temp++;
            }

            }if (temp==0){
            System.out.println("xóa không thành công");

            }
    }

    public static void updateProduct() {
        System.out.println("Vị trí bạn muốn sửa");
        int up = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == up) {
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
            productList[index] = new Product(up, name, price, amount, production);
            System.out.println("Sửa thành công");

        } else {
            System.out.println("id nhập không đúng");
        }

    }

    public static void main(String[] args) {
        do {
            System.out.println("---------product Management--------");
            System.out.println("1.Display list product");
            System.out.println("2. Add new product");
            System.out.println("3. Search product");
            System.out.println("4. Delete product");
            System.out.println("5. update product ");
            System.out.println("6. Exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    displayList();
                    break;
                case 2:
                    System.out.println("add new");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("search product");
                    search();
                    break;
                case 4:
                    System.out.println("Delete product");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println(" update product");
                    updateProduct();
                    break;

                case 6:
                    System.exit(0);


            }
        } while (true);

    }
}
