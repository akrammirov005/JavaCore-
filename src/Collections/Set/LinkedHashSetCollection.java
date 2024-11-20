package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollection {
    public static void main(String[] args) {
        //The LinkedHashSet class of the Java collections framework provides
        // functionalities of both the hashtable and the linked list data structure.
        //Elements of LinkedHashSet are stored in hash tables similar to HashSet.
        //However, linked hash sets maintain a doubly-linked list internally for all of its elements.
        // The linked list defines the order in which elements are inserted in hash tables.
        //Use HashSet if you don't want to maintain any order of elements. Use LinkedHashSet if you want to maintain insertion order of elements.
        Set<String> fruits = new LinkedHashSet<String>();
        LinkedHashSet<String> fruits1 = new LinkedHashSet<String>();

        //LinkedHashSet can use all method which HashSet can use
        fruits1.add("Apple");
        fruits1.add("Pear");
        fruits1.add("Banana");
        fruits1.add("Mango");
        System.out.println(fruits1);
        System.out.println("-------------------------------------");

        //Iteration
        Iterator<String> iterator = fruits1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
