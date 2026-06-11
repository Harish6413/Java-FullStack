package Oops.Collections.Queue;

import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("1. Add a song \n2. Remove a song\n3. View current song\n0. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter song to add");
                    String str = sc.next();
                    q.offer(str);
                    System.out.println("Song Added : "+str);
                    break;
                case 2:
                    System.out.println("Enter song to remove");
                    System.out.println("Removed the song : "+q.poll());
                    break;
                case 3:
                    System.out.println("Current song : " + q.peek());
                    break;
            }
        }while (ch != 0);
        System.out.println(q);

    }
}
