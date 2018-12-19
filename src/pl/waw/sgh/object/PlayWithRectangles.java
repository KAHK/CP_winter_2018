package pl.waw.sgh.object;

public class PlayWithRectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        //r1.setParams(4,5);
        r1.setParB(30); //not a good practice to allow anybody to change params directly
        System.out.println("R1 surface = " + r1.calculateSurface());
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle(3, 6);
        //r2.setParams(3,6);
        System.out.println("R2 surface = " + r2.calculateSurface());
        System.out.println(r2.toString());
        System.out.println("R3: " + new Rectangle(7, 8).toString());
    }
}
