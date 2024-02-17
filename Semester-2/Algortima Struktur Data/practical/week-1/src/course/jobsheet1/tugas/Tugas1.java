package src.course.jobsheet1.tugas;

import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {

        char plateCode[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char cityName[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };

        Scanner sc = new Scanner(System.in);

        System.out.print("Input plate : ");
        String input = sc.nextLine();
        String city = "";

        // print if input equals to city name
        for (int i = 0; i < cityName.length; i++) {
            if (plateCode[i] == input.toUpperCase().charAt(0)) {
                for (int j = 0; j < cityName[i].length; j++) {
                    city += cityName[i][j];
                }
            } else {
                System.out.println("City not found");
                break;
            }
        }
        System.out.println(city);
    }
}
