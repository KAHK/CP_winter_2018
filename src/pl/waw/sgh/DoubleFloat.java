package pl.waw.sgh;

import java.text.NumberFormat;

public class DoubleFloat {

    public static void main(String[] args) {
        Double d1 = 247674d;
        //f
        //L
        double d2 = 247674;
        float f2 = 456912;

        //d2 - f2;
        float f1 = d1.floatValue();
        d1.intValue();
        //convert primitive to object
        Double d3 = Double.valueOf(d2);

        System.out.println(d1 * d2);

    }
}
