package Oops.Collections.LinkedLists;

public class LinkedListsExample {

    private Node head;
    private Node tail;
    private int size;

    void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
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
        }
        else
        {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void insertAt(int index, int value)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if (index == size-1)
        {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    int deleteFirst()
    {
        if(size == 0)
        {
            tail = head;
            return -1;
        }
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    Node get(int index)
    {
        Node temp = head;
        for (int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    int deleteLast()
    {
        if (size <= 1)
        {
            return deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
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
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    void display()
    {
        Node temp=head;
        while (temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListsExample obj = new LinkedListsExample();
        obj.insertFirst(5);
        obj.insertLast(1);
        obj.insertLast(2);
        obj.insertFirst(4);
        obj.display();
        obj.insertAt(2,23);
        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.insertLast(22);
        obj.insertFirst(12);
        obj.display();
        obj.deleteAt(2);
        obj.display();
        System.out.println(obj.deleteFirst());
        System.out.println(obj.deleteFirst());
        System.out.println(obj.deleteFirst());
        obj.display();
        System.out.println(obj.deleteFirst());
        System.out.println(obj.deleteFirst());
    }
}
