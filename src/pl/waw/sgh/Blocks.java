package pl.waw.sgh;

public class Blocks {

    //the widest visibility - everywhere
    public static int i0 = 5;

    //for static variables behave like public
    // protected static int i0=5;
    //a constant -final - cannot be changed
    // // static final String MY_CONSTANT = "some text";
    public static void main(String[] args) {
        int i1 = 0;
        // //System.out.println(MY_CONSTANT);
        // //MY_CONSTANT="fwieib";
        System.out.println("inside a block i0=" + i0);
        {

            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2=" + i2);
            {
                int i3 = 7;
                System.out.println("inside a internal block i1=" + i1);
            }
            {
                //  System.out.println("inside a internal block i2=" + i2);
            }
        }
        System.out.println("outside the block i1=" + i1);
        //i2 not visible in the parent block
        int i2 = 5;
        System.out.println("outside the block i2=" + i2);
    }
}
