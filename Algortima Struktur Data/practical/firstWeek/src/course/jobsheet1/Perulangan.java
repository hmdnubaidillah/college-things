package src.course.jobsheet1;

/*
 * cetak angka 1 - n dengan catatan:
 * kecuali 6 dan 10
 * angka ganjil dicetak dengan "*"
 * n = 2 digit terakhir nim
 * jika n < 10 maka n + 10
 * 
 * nim = 2341760190
 */

public class Perulangan {
    public static void main(String[] args) {
        int lastDigitNim = 90;

        // check if last digit nim les than 10
        if (lastDigitNim < 10) {
            lastDigitNim += 10;
        }

        for (int i = 1; i <= lastDigitNim; i++) {

            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
        }
    }
}
