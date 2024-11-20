package Collections.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String[] args) {
        //Java LinkedList
        //The LinkedList class is almost identical to the ArrayList:
        List<String> linkedList = new LinkedList<String>();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        System.out.println("-------------------------------------");

        //Add Items
        linkedList1.add("Apple");
        linkedList1.add("Pear");
        linkedList1.add("Cherry");
        System.out.println(linkedList1);
        System.out.println("-------------------------------------");

        //Access Items
        System.out.println(linkedList1.get(0));
        System.out.println(linkedList1.get(1));
        System.out.println(linkedList1.get(2));
        System.out.println("-------------------------------------");

        //ArrayList vs. LinkedList
        // also use all methods which use ArrayList
        //The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
        //The LinkedList class has all the same methods as the ArrayList class because they both implement the List interface.
        // This means that you can add items, change items, remove items and clear the list in the same way.
        //However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

        //When To Use;
        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
        //LinkedList Methods
        //For many cases, the ArrayList is more efficient as it is common to need access to random items in the list,
        //but the LinkedList provides several methods to do certain operations more efficiently:
        linkedList1.addFirst("Peach");
        linkedList1.addLast("Watermelon");
        System.out.println(linkedList1);
        System.out.println("-------------------------------------");

        linkedList1.removeFirst();
        linkedList1.removeLast();
        System.out.println(linkedList1);
        System.out.println("-------------------------------------");

        String first = linkedList1.getFirst();
        String second = linkedList1.getLast();
        System.out.println(first);
        System.out.println(second);
        System.out.println("-------------------------------------");

        //Enhanced Loop
        for (String array:linkedList1){
            System.out.println(array);
        }


    }
}
