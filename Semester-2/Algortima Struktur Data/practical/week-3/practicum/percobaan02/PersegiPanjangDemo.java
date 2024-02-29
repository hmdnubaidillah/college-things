package practicum.percobaan02;

import java.util.*;

class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan length array : ");
        int arrLength = sc.nextInt();

        PersegiPanjang[] arrOfPersegiPanjang = new PersegiPanjang[arrLength];
        int panjang, lebar;

        for (int i = 0; i < arrOfPersegiPanjang.length; i++) {

            System.out.println("Persegi panjang ke : " + (i + 1));
            System.out.print("Masukan panjang : ");
            panjang = sc.nextInt();

            System.out.print("Masukan lebar : ");
            lebar = sc.nextInt();

            arrOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
            arrOfPersegiPanjang[i].hitungLuas();
            arrOfPersegiPanjang[i].hitungKeliling();
        }

        new PersegiPanjang(0, 0).cetakInfo(arrOfPersegiPanjang);
    }
}
