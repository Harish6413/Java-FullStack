package Oops.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class MyQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        System.out.println(q.poll());
        q.offer(8);
        q.offer(6);
        q.offer(7);
        System.out.println(q.element());
        System.out.println(q.contains(6));
    }
}
