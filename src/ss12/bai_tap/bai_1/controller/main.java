package ss12.bai_tap.bai_1.controller;

import ss12.bai_tap.bai_1.Service.IProductService;
import ss12.bai_tap.bai_1.Service.ProductManager;

import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);

    public main(String[] args) {
        IProductService productService = new ProductManager();

        do {
            System.out.println("-------------Product Management------------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Sort Product");
            System.out.println("7. Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    productService.displayList();
                    break;
                case 2:
                    productService.addNewProduct();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4 :
                    productService.deleteProduct();
                    break;
                case 5:
                    productService.updateProduct();
                    break;
                case 6:
                    productService.sortProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
}}
