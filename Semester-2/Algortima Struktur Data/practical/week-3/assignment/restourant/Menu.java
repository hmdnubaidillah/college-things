package assignment.restourant;

import java.util.Scanner;

public class Menu {
    int id;
    static int ID = 0;
    String nama;
    int stock;
    int price;

    public Menu(String nama, int stock, int price) {
        this.id = ID++;
        this.nama = nama;
        this.stock = stock;
        this.price = price;
    }

    void deleteMenu(Menu menus[], int menuId) {
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != null) {
                if (menus[i].id == menuId) {
                    menus[i] = null;
                }
            }
        }
    }

    void seeMenu(Menu menus[]) {
        for (int i = 0; i < menus.length; i++) {

            if (menus[i] != null) {
                System.out.println("id : " + menus[i].id);
                System.out.println("nama : " + menus[i].nama);
                System.out.println("price : " + menus[i].price);
                System.out.println("stock : " + menus[i].stock);
                System.out.println();
            } else {
                continue;
            }
        }
    }

    void editMenu(Menu menus[], int menuId) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != null) {

                if (menus[i].id == menuId) {
                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Price : ");
                    int price = sc.nextInt();

                    System.out.print("Stock : ");
                    int stock = sc.nextInt();

                    sc.nextLine();

                    menus[i].nama = name;
                    menus[i].stock = stock;
                    menus[i].price = price;

                    System.out.println();
                }
            }
        }
    }
}
