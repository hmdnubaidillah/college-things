package assignment.restourant;

import java.util.Scanner;

class Main {
    static Menu menus[] = new Menu[99];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu(null, 0, 0);

        while (true) {
            System.out.println("1. Add menu");
            System.out.println("2. Edit menu");
            System.out.println("3. Delete menu");
            System.out.println("4. See menus");
            System.out.println();
            System.out.print("Enter input : ");
            int input = sc.nextInt();
            System.out.println();

            switch (input) {
                case 0:
                    sc.close();
                    break;

                case 1:
                    // add menu
                    System.out.print("Enter amount of menu : ");
                    int amount = sc.nextInt();
                    addMenu(amount);
                    break;
                case 2:
                    // edit menu
                    System.out.println();
                    menu.seeMenu(menus);
                    System.out.println();

                    System.out.print("Select menu to edit : ");
                    int menuId = sc.nextInt();
                    menu.editMenu(menus, menuId);
                    break;

                case 3:
                    // delete menu
                    System.out.println();
                    menu.seeMenu(menus);
                    System.out.println();

                    System.out.print("Select menu to delete : ");
                    int menuIdDel = sc.nextInt();
                    menu.deleteMenu(menus, menuIdDel);
                    break;
                case 4:
                    // see menu
                    menu.seeMenu(menus);
                    break;
                default:
                    System.out.println("input not valid");
                    break;
            }
        }
    }

    static void addMenu(int length) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Price : ");
            int price = sc.nextInt();

            System.out.print("Stock : ");
            int stock = sc.nextInt();

            sc.nextLine();
            menus[i] = new Menu(name, stock, price);
            System.out.println();
        }
    }
}
