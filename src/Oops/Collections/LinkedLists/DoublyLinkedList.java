package Oops.Collections.LinkedLists;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node
    {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    void insertLast(int value)
    {
        if(tail == null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
        tail.next = null;
        size++;
    }

    Node get(int index)
    {
        Node temp = head;
        for (int i = 0; i < index-1; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    void insertAt(int index, int value)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if(index == size-1)
        {
            insertLast(value);
            return;
        }
        Node temp = get(index);
        Node node = new Node(value, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    int deleteFirst()
    {
        if(size==0)
        {
            return -1;
        }
        int val = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    int deleteLast()
    {
        if(size == 0)
        {
            return -1;
        }
        int val = tail.value;
        Node temp = get(size-1);
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    int deleteAt(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            return deleteLast();
        }
        Node temp = get(index);
        int val = temp.next.value;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return val;
    }

    void display()
    {
        Node temp = head;
        System.out.print("NULL <-> ");
        while (temp != null)
        {
            System.out.print(temp.value+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertLast(1);
        obj.insertFirst(2);
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.display();
        obj.insertAt(2,3);
        obj.display();
        obj.deleteFirst();
        obj.display();
        System.out.println(obj.deleteAt(1));
        obj.display();
    }

}
