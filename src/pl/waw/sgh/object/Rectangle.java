package pl.waw.sgh.object;

public class Rectangle {
    double parA = 0;
    double parB = 0;
/*public Rectangle(){
}
 */

    public Rectangle(double parA, double parB) {
        setParams(parA, parB);
    }

    public void setParams(double parA, double b) {
        this.parA = parA;
        parB = b;
    }

    public double calculateSurface() {
        return parA * parB;
    }

    public void setParB(double parB) {
        this.parB = parB;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + parA + "," + parB +
                "], surface:" + calculateSurface();
    }
}
