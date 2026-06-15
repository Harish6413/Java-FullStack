package FileHandling;

import java.io.*;

public class ByteToByteFH {
    public static void main(String[] args) throws IOException {
        String iPath = "C:\\Users\\haris\\IdeaProjects\\Sample.java\\src\\FileHandling\\test.txt";
        File f1 = new File(iPath);
        String oPath = "C:\\Users\\haris\\IdeaProjects\\Sample.java\\src\\FileHandling\\test2.txt";
        File f2 = new File(oPath);
        FileInputStream fis1 = new FileInputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f2);
        int ch;
        while ((ch=fis1.read()) != -1)
        {
            fos2.write((char)ch);
        }
        fis1.close();
        fos2.close();
    }
}
