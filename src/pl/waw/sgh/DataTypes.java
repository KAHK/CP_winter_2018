package pl.waw.sgh;

public class DataTypes {

      /*
      This is a comment, Ctrl + Shift + / is a shortcut to make text a comment
       Press again to uncomment
       */

    //pvsm - this is an one-line comment I suppose
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 120;
 /*
       int i1 = 1434646464;
        int i2 = 985245454
                int i3 = i1 + i2;
  */
        int i1 = 1434535355;
        int i2 = 985245454;
        long i3 = i1;
        // i3 = i3 + 12
        i3 += i2;
        /// long i3 = i1 + i2;

        //sout
        // Python : str(i3)
        System.out.println("i3: " + i3);
        int a = 5;
        int b, bb;
        b = a++;
        a = 5;
        bb = ++a;

        // Ctrl + D to copy the line
        System.out.println("b=" + b);
        System.out.println("bb=" + bb);

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1, d2);

        System.out.println("d3=" + d3);

    }
}
