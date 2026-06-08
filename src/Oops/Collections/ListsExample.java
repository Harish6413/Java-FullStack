package Oops.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ferrari");
        list.add("Mercedes");
        list.add("Red Bull");
        list.add("McLaren");
        System.out.println(list);
        list.add(2,"Haas");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(2,"Red Bull");
        System.out.println(list);
    }
}
