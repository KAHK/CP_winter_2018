package pl.waw.sgh;

import static pl.waw.sgh.BowIsRecursion.sumBowls;

public class BowIsRecursion {
    public static int sum(int parA, int parB) {
        int sum = parA + parB;
        return sum;
    }

    public static int sumBowls(int row) {
        if (row == 1) return 1;
        else return sumBowls(row - 1) + 1;


        //System.out.println("Bowls in row 5: " + sumBowls(5));
        //quick question wtf
    }
}
