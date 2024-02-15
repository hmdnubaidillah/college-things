package src.course.jobsheet1;

import java.util.*;
import java.math.*;

/**
 * Pemilihan
 */
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai Tugas : "); // 20%
        float tugas = sc.nextFloat();

        System.out.print("Masukan Nilai Kuis : "); // 20%
        float kuis = sc.nextFloat();

        System.out.print("Masukan Nilai UTS : "); // 30%
        float uts = sc.nextFloat();

        System.out.print("Masukan Nilai UAS : "); // 40%
        float uas = sc.nextFloat();

        float nilaiAkhir = 0;
        boolean isNilaiValid = true;
        String nilaiHuruf = "";

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            isNilaiValid = false;
            return;
        }

        nilaiAkhir = ((tugas * 20) / 100) + ((kuis * 20) / 100) + ((uts * 30) / 100) + ((uas * 40) / 100);
        nilaiAkhir = nilaiAkhir > 100 ? Math.min(nilaiAkhir, 100) : nilaiAkhir;

        if (!isNilaiValid) {
            System.out.println("Nilai tidak valid");
            return;
        }

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }

        System.out.printf("Nilai Akhir : %f\n", nilaiAkhir);
        System.out.printf("Nilai Huruf : %s\n", nilaiHuruf);

    }
}