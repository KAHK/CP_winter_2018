package pl.waw.sgh;

public class BowIsRecursion {
    public static int sum(int parA, int parB) {
        int sum = parA + parB;
        return sum;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(sum(a, b));
    }
}
