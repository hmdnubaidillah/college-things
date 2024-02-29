package practicum.percobaan02;

class PersegiPanjang {
    int panjang;
    int lebar;

    int keliling;
    int luas;

    public PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    void cetakInfo(PersegiPanjang[] persegiPanjang) {

        for (int i = 0; i < persegiPanjang.length; i++) {
            System.out.printf("Persegi panjang ke-%d, panjang %d, lebar %d\n",
                    (i + 1),
                    persegiPanjang[i].panjang,
                    persegiPanjang[i].lebar);

            System.out.printf("Persegi panjang ke-%d, luas : %d, keliling : %d\n",
                    (i + 1),
                    persegiPanjang[i].luas,
                    persegiPanjang[i].keliling);
        }
    }

    void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }

    void hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }
}