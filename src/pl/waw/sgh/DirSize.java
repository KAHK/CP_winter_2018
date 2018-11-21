package pl.waw.sgh;

import java.io.File;

public class DirSize {
    private static long counter = 0;

    public static void CheckDirectorySize(File newFile) {
        File[] files = newFile.listFiles();
        for (File f : files) {
            if (newFile.isDirectory()) {
                System.out.println("In folder" + newFile.getName() + "there are" + files.length + " files");
                System.out.println("File" + f.getName() + "size" + f.length());
                counter += f.length();
            } else if (newFile.isDirectory()) {
                long subfolderSize = CheckDirectorySize(f);
                System.out.println("Subfolder" + f.getName() + "size: " + subfolderSize(f));
                counter += subfolderSize;
                System.out.println("Folder" + newFile.getName() + "size:" + f.length());
            }
            return counter;
        }


        public static void main (String[]args){
            File newFile = new File(C:\Temp);
            long totalSize = CheckDirectorySize(newFile);
            System.out.println("Total size" + totalSize);

        }
    }