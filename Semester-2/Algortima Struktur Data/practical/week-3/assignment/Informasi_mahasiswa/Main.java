package assignment.Informasi_mahasiswa;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner mhsSc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int mhsLength = sc.nextInt();

        Mahasiswa arrMahasiswa[] = new Mahasiswa[mhsLength];

        float ipks[] = new float[mhsLength];
        for (int i = 0; i < mhsLength; i++) {
            System.out.print("Nama : ");
            String namaMhs = mhsSc.nextLine();

            System.out.print("NIM : ");
            String nimMhs = mhsSc.nextLine();

            System.out.print("Jenis kelamin : ");
            String kelaminMhs = mhsSc.nextLine();

            System.out.print("IPK : ");
            float ipkMhs = mhsSc.nextFloat();
            mhsSc.nextLine();

            arrMahasiswa[i] = new Mahasiswa(namaMhs, nimMhs, kelaminMhs, ipkMhs);
            ipks[i] = ipkMhs;
        }

        System.out.println();

        for (Mahasiswa mhs : arrMahasiswa) {
            System.out.println("Nama : " + mhs.nama);
            System.out.println("NIM : " + mhs.nim);
            System.out.println("Kelamin : " + mhs.kelamin);
            System.out.println("IPK : " + mhs.ipk);
        }

        float rataIpkMhs = getAveragaMhsIPK(ipks, arrMahasiswa.length);
        System.out.printf("Rata rata : %f\n", rataIpkMhs);
    }

    static float getAveragaMhsIPK(float[] ipk, int length) {
        float temp = 0;

        for (int i = 0; i < length; i++) {
            temp += ipk[i];
        }

        return temp / length;
    }

}
