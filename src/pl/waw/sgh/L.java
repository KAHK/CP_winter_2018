package pl.waw.sgh;

public class L {

    public static void main(String[] args) {
        int i, m, count;

        System.out.println(" Prime Numbers list: ");
        for (m = 1; m <= 10; m++) {
            count = 0;
            for (i = 2; i <= m / 2; i++) {
                if (m % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && m != 1) {
                System.out.print(m + " ");
            }
        }
    }
}
