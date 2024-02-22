package dragon;

import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Dragon dragon = new Dragon(5, 5);

        while (true) {
            System.out.println();
            System.out.printf("width : %d\nheight : %d\n", dragon.width, dragon.height);
            System.out.println();
            System.out.println("1. Move left");
            System.out.println("2. Move right");
            System.out.println("3. Move up");
            System.out.println("4. Move bottom");
            System.out.println("5. print position");
            System.out.println();
            System.out.print("enter value? (0 : exit) : ");

            int input = sc.nextInt();
            System.out.println();

            switch (input) {
                case 0:
                    return;
                case 1:
                    dragon.moveLeft();
                    break;

                case 2:
                    dragon.moveRight();
                    break;

                case 3:
                    dragon.moveUp();
                    break;

                case 4:
                    dragon.moveBottom();
                    break;

                case 5:
                    dragon.printPosition();
                    break;

                default:
                    System.out.println("Input not valid");
                    break;
            }
        }
    }
}