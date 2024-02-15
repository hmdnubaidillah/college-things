package src.course.jobsheet1;

public class Fungsi {

    static String branchsName[] = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4" };
    static String flowers[] = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int flowersPrice[] = { 75_000, 50_000, 60_000, 10_000 };
    static String getBranchName = "";

    // each of inner array represents cabang toko
    // ex: 1st index is Royal Garden 1
    static int flowersStock[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int[] calculateIncomeOfEachBranch() {
        int incomeOfEachBranch[] = new int[branchsName.length];

        /*
         * logic :
         * buat fungsi untuk menampilkan pendapatan tiap cabang jika semua bunga habis
         * terjual
         * 
         * multiply stock bunga with harga bunga
         * 
         */

        // multiply stock bunga with harga bunga
        for (int i = 0; i < flowersStock.length; i++) {
            for (int j = 0; j < flowersStock[i].length; j++) {
                incomeOfEachBranch[i] = flowersPrice[i] * flowersStock[i][j];
            }
        }

        return incomeOfEachBranch;
    }

    public static String[][] getFLowerStocks(String branchName) {

        String[][] res = new String[branchsName.length][2];

        getBranchName = branchName;

        // get branch name
        for (int i = 0; i < flowersStock.length; i++) {
            if (branchName.equalsIgnoreCase(branchsName[i])) {
                for (int j = 0; j < flowersStock[i].length; j++) {
                    res[i][0] = branchsName[i];
                    res[i][1] = Integer.toString(flowersStock[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int incomeOfEachBranch[] = calculateIncomeOfEachBranch();
        String[][] getFlowersStock = getFLowerStocks(branchsName[3]); // get Royal Garden 4

        // soal 1
        for (int i = 0; i < incomeOfEachBranch.length; i++) {
            System.out.printf("%s Rp.%d\n", branchsName[i], incomeOfEachBranch[i]);
        }
        System.out.println();
        // soal 2
        for (int i = 0; i < getFlowersStock.length; i++) {
            for (int j = 0; j < getFlowersStock[i].length; j++) {
                System.out.printf("Branch %s, Flower %s, Stock %s\n",
                        getFlowersStock[i][0],
                        getFlowersStock[i][1],
                        getFlowersStock[i][2]);
                break;
            }
        }
    }
}
