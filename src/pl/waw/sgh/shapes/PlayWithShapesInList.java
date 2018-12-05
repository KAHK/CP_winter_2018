package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayWithShapesInList {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(1, 2));
        shapeList.add(new Circle(1));
        shapeList.add(new Triangle(1, 2));
        shapeList.add(new EqTriangle(1));
        Collections.sort(shapeList, new ShapeComparator()); // List >>> Array
        for (Shape sh : shapeList) {
            System.out.println(sh);
        }

    }
}
