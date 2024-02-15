package src.course.jobsheet1.tugas;

import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {

        String plateCode[] = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        String cityName[][] = {
                { "BANTEN" },
                { "JAKARTA" },
                { "BANDUNG" },
                { "CIREBON" },
                { "BOGOR" },
                { "PEKALONGAN" },
                { "SEMARANG" },
                { "SURABYA" },
                { "MALANG" },
                { "TEGAL" } };

        Scanner sc = new Scanner(System.in);

        System.out.print("Input plate : ");
        String input = sc.nextLine();

        // get first digit of input
        String firstDigit = String.valueOf(input.charAt(0));

        // get arr index
        int arrIndex = -1;
        for (int i = 0; i < plateCode.length; i++) {

            if (plateCode[i].equals(firstDigit.toUpperCase())) {
                arrIndex = i;
                break;
            }
        }

        String city = "";

        // print if input equals to city name
        for (int i = 0; i < cityName.length;) {
            city += cityName[arrIndex][0];
            break;
        }

        System.out.println(city);
    }
}
