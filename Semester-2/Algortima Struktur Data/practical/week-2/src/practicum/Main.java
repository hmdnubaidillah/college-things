package practicum;

public class Main {
    public static void main(String[] args) {
        Buku17 buku1 = new Buku17("Foo", "John Doe", 10, 100, 10_000);
        buku1.terjual(2);
        buku1.hitungHargaTotal();
        buku1.hitungDiskon();
        buku1.tampilInformasi();

    }
}
