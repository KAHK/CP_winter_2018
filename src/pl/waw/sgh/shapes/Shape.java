package pl.waw.sgh.shapes;

public class Shape {
    private double parA = 0;
    private double parB = 0;

    public Shape(double parA, double parB) {
        setParams(parA, parB);
    }

    public void setParams(double parA, double b) {
        this.parA = parA;
        this.parB = b;
    }
}
