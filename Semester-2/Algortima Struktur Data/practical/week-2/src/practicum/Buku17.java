package practicum;

/**
 * Percobaan1
 */
public class Buku17 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;
    int terjual;
    int hargaTotal;
    int hargaDiskon;
    int hargaAfterDiskon;
    boolean isDiskon = false;

    public Buku17(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("halaman : " + this.halaman);
        System.out.println("Stok : " + this.stok);
        System.out.println("Harga : " + this.harga);
        System.out.println("Total Harga : " + this.hargaTotal);

        if (this.isDiskon) {
            System.out.println("Diskon : " + this.hargaDiskon);
            System.out.println("Harga setelah diskon : " + this.hargaAfterDiskon);
        }

    }

    void terjual(int jmlh) {
        if (this.stok <= 0) {
            return;
        }
        this.terjual = jmlh;
        this.stok -= jmlh;
    }

    void restock(int jmlh) {
        this.stok += jmlh;
    }

    void gantiHarga(int harga) {
        this.harga = harga;
    }

    void hitungHargaTotal() {
        this.hargaTotal = this.terjual * this.harga;
    }

    void hitungDiskon() {
        if (this.hargaTotal > 150_000) {
            this.isDiskon = true;
            this.hargaDiskon = (this.hargaTotal * 12) / 100;
            this.hargaAfterDiskon = this.hargaTotal - this.hargaDiskon;
            return;
        }

        if (this.hargaTotal >= 75_000 && this.hargaTotal <= 150_000) {
            this.isDiskon = true;
            this.hargaDiskon = (this.hargaTotal * 5) / 100;
            this.hargaAfterDiskon = this.hargaTotal - this.hargaDiskon;
            return;
        }
    }
}