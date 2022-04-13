package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
//        Product product1 = new Product(001,"Mai",1000);
//        Product product2 = new Product(002,"Dao",3000);
//        Product product3 = new Product(003,"Cam",2000);
//        Product product4 = new Product(004, "Quat", 5000);
//        productManager.addProduct(product1);
//        productManager.addProduct(product2);
//        productManager.addProduct(product3);
//        productManager.addProduct(product4);

        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int selected;
        do {
            System.out.println("Menu"
                    + "\n1. Thêm sản phẩm"
                    + "\n2. Sửa thông tin sản phẩm theo id"
                    + "\n3. Xóa sản phẩm theo id"
                    + "\n4. Hiển thị danh sách"
                    + "\n5. Tìm kiếm sản phẩm theo tên"
                    + "\n6. Sắp xếp sản phầm theo giá tăng dần"
                    + "\n7. Sắp xếp sản phầm theo giá giảm dần"
                    + "\n8. Exit");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    System.out.println("Nhập dữ liệu sản phẩm theo thứ tự id, name, price");
                    int id = Integer.parseInt(scanner.nextLine());
                    String name = scanner.nextLine();
                    double price = Double.parseDouble(scanner.nextLine());
                    productManager.addProduct(id, name, price);
                    while (id != 0) {
                        System.out.println("Nhập dữ liệu sản phẩm theo thứ tự id, name, price");
                        try {
                        id = Integer.parseInt(scanner.nextLine());
                        name = scanner.nextLine();
                        price = Double.parseDouble(scanner.nextLine());
                        productManager.addProduct(id, name, price);
                        }catch (NumberFormatException e){
                        break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập id");
                    int id2 = scanner.nextInt();
                    System.out.println("Nhập giá và sản phẩm cần sửa theo thứ tự name.price");
                    String name2 = scanner.nextLine();
                    scanner.nextLine();
                    double price2 = scanner.nextDouble();
                    productManager.editProduct(id2, name2, price2);
                    break;
                case 3:
                    System.out.println("Nhập id");
                    int id3 = scanner.nextInt();
                    productManager.deleteProduct(id3);
                    break;
                case 4:
                    System.out.println(productManager.productList);
                    break;
                case 5:
                    System.out.println("Nhập tên");
                    String name3 = scanner.nextLine();
                    productManager.findByName(name3);
                    break;
                case 6:
                    productManager.sortAZ();
                    System.out.println("So sanh theo gia nho -> lon");
                    for (Product product :
                            productManager.productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 7:
                    productManager.sortZA();
                    System.out.println("So sanh theo gia lon -> nho");
                    for (Product product :
                            productManager.productList) {
                        System.out.println(product.toString());
                    }
                    break;
            }
        } while (selected != 8);

    }
}
