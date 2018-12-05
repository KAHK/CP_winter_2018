package pl.waw.sgh.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        Double sumofPars1 = Double.valueOf(o1.getParA() + o1.getParB());
        Double sumofPars2 = Double.valueOf(o2.getParA() + o2.getParB());
        return sumofPars1.compareTo(sumofPars2);
    }
}
