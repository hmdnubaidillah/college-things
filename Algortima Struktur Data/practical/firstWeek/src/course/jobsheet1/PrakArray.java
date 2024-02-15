package src.course.jobsheet1;

import java.util.*;

/*
 * 
 * 
 * 
 * 
 */

public class PrakArray {

    static String matkul[] = { "Matdas", "Agama", "PAMB", "KTI", "BIN", "BIG", "CTPS", "Daspro", "P.Daspro" };
    static int SKS[] = { 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    static String nilaiHuruf[] = new String[matkul.length];
    static double bobotNilai[] = new double[matkul.length], nilai;

    public static void CalculateNilai(double nilaiMK[]) {

        for (int i = 0; i < nilaiMK.length; i++) {
            if (nilaiMK[i] <= 100 && nilaiMK[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;

            } else if (nilaiMK[i] <= 80 && nilaiMK[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;

            } else if (nilaiMK[i] <= 73 && nilaiMK[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;

            } else if (nilaiMK[i] <= 65 && nilaiMK[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;

            } else if (nilaiMK[i] <= 60 && nilaiMK[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;

            } else if (nilaiMK[i] <= 50 && nilaiMK[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;

            } else if (nilaiMK[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
    }

    public static double CalculateIP(double bobotNilai[]) {
        int totalSKS = 0;

        // sum SKS
        for (int i = 0; i < SKS.length; i++) {
            totalSKS += SKS[i];
        }

        double temp[] = new double[SKS.length];
        // multiply each of bobot nilai with sks
        for (int i = 0; i < SKS.length; i++) {

            // store to temp
            temp[i] = bobotNilai[i] * SKS[i];
        }

        double IP = 0;

        // sum temp
        for (int i = 0; i < temp.length; i++) {
            IP += temp[i];
        }

        return IP / totalSKS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiMatkul[] = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Nilai Matkul " + matkul[i] + " : ");
            nilaiMatkul[i] = sc.nextDouble();
        }

        CalculateNilai(nilaiMatkul);
        double IP = CalculateIP(bobotNilai);

        System.out.println();
        System.out.println("MATKU       NILAI ANGKA    NILAI HURUF    BOBOT NILAI");
        for (int i = 0; i < matkul.length; i++) {
            // Adjust column widths and align columns
            System.out.printf("%-12s%-15s%-15s%-10s\n",
                    matkul[i], nilaiMatkul[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("IP = " + IP);
    }
}
