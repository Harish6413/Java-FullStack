package FileHandling;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting my file");
        String path ="C:\\Users\\haris\\IdeaProjects\\Sample.java\\src\\FileHandling\\test.txt";
        File f = new File(path);
//        FileWriter fw = new FileWriter(f);
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("HELLO, I'm Harish");
//        Scanner sc =new Scanner(System.in);
//        bw.newLine();
//        String userInput = sc.nextLine();
//        bw.write(userInput);
//        bw.close();
//        fw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int ch;
        int c=0;
        while ((ch= br.read())!=-1){
            System.out.print((char) ch);
            c++;
        }
        System.out.println();
        System.out.println(c);


    }
}
