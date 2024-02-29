package practicum.percobaan01;

import java.util.*;

class PersegiPanjangDemo {
        public static void main(String[] args) {
                PersegiPanjang[] arrOfPersegiPanjang = new PersegiPanjang[3];

                arrOfPersegiPanjang[0] = new PersegiPanjang();
                arrOfPersegiPanjang[0].panjang = 110;
                arrOfPersegiPanjang[0].lebar = 30;

                arrOfPersegiPanjang[1] = new PersegiPanjang();
                arrOfPersegiPanjang[1].panjang = 80;
                arrOfPersegiPanjang[1].lebar = 40;

                arrOfPersegiPanjang[2] = new PersegiPanjang();
                arrOfPersegiPanjang[2].panjang = 100;
                arrOfPersegiPanjang[2].lebar = 20;

                System.out.println("persegi panjang ke-1, panjang : " + arrOfPersegiPanjang[0].panjang + ", lebar : "
                                + arrOfPersegiPanjang[0].lebar);

                System.out.println("persegi panjang ke-2, panjang : " + arrOfPersegiPanjang[1].panjang + ", lebar : "
                                + arrOfPersegiPanjang[1].lebar);

                System.out.println("persegi panjang ke-3, panjang : " + arrOfPersegiPanjang[2].panjang + ", lebar : "
                                + arrOfPersegiPanjang[2].lebar);

        }
}