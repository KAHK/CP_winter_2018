package pl.waw.sgh;

public class Trying {

    public static void print_sums() {

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
            sum = 0;
        }

    }

    public static void main(String[] args) {
        print_sums();


    }
}
