package pl.waw.sgh;

import java.util.Properties;

public class FileOper { //means File Operations\
    public static void main(String[] args) {
        String tmp = System.getenv("TMP");
        System.out.println(tmp); // temp - almost invisible for the user

        //Properties props = System.getProperties();
        tmp = System.getProperty("java.io.tmpdir");
        System.out.println(tmp);

        String myProp = System.getProperty("myprop", "defaultvalue");
        System.out.println("myprop : " + myProp);

        tmp = System.getProperty("os.name");
        System.out.println(tmp);

        tmp = System.getProperty("user.name");
        System.out.println(tmp);

    }
}
