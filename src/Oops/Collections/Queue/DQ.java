package Oops.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(4);
        dq.addFirst(5);
        dq.addLast(3);
        dq.addLast(2);
        dq.addLast(1);
        System.out.println(dq);
        dq.remove(3);
        System.out.println(dq);
    }
}
