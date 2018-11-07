package pl.waw.sgh;

import java.util.Scanner;

public class InputParamScanner {
    public static void main(String[] args) {
        System.out.println("This is output.");
        System.err.println("This is error.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your integer: ");
        // \t - tab
        // \n - new line (Mac and Unix)
        // \r\n - Windows CR LF

        while (scanner.hasNextInt()) {
            Integer myInt = scanner.nextInt();
            if (myInt.equals(0)) break;
            System.out.println("I got " + myInt);
        }
    }
}
