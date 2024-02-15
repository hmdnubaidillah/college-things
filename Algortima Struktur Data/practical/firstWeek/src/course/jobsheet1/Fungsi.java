package src.course.jobsheet1;

public class Fungsi {

    static String branchsName[] = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4" };
    static String flowersName[] = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
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

    public static String[][] getFLowerStocks(String branchName, String[][] deadFlower) {
        String[][] res = new String[flowersStock.length][2];

        getBranchName = branchName;
        // get branchs name index
        int branchIndex = -1;

        for (int i = 0; i < branchsName.length; i++) {
            if (branchsName[i].equals(branchName)) {
                branchIndex = i;
                break;
            }
        }

        // calcualte if there are dead flowers
        for (int i = 0; i < flowersStock.length; i++) {
            flowersStock[branchIndex][i] -= Integer.parseInt(deadFlower[i][1]);
        }

        // get branch stock and flower
        for (int i = 0; i < flowersStock.length; i++) {
            res[i][0] = flowersName[i];
            res[i][1] = Integer.toString(flowersStock[branchIndex][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        // stock reduced because flowers dies
        String deadFlower[][] = { { "Aglonema", "1" }, { "Keladi", "2" }, { "Alocasia", "0" }, { "Mawar", "5" } };

        int incomeOfEachBranch[] = calculateIncomeOfEachBranch();
        String[][] getFlowersStock = getFLowerStocks(branchsName[3], deadFlower); // get Royal Garden 4

        // soal 1
        for (int i = 0; i < incomeOfEachBranch.length; i++) {
            System.out.printf("%s Rp.%d\n", branchsName[i], incomeOfEachBranch[i]);
        }

        System.out.println();

        // soal 2
        System.out.println(getBranchName);
        for (int i = 0; i < branchsName.length; i++) {
            System.out.printf("Flower %s, Stock %s\n",
                    getFlowersStock[i][0],
                    getFlowersStock[i][1]);
        }
    }
}
