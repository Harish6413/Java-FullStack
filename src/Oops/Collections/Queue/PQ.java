package Oops.Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(12);
        pq.offer(15);
        pq.offer(100);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(20);
        pq1.offer(12);
        pq1.offer(15);
        pq1.offer(100);
        System.out.println("with comparator:");
        for (int i = 0; i < pq.size(); i++) {
            System.out.println(pq.remove());
        }
        System.out.println("without comparator");
        for (int i = 0; i < pq1.size(); i++) {
            System.out.println(pq1.poll());
        }
    }
}
