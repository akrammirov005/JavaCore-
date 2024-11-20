package Collections.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        //A TreeSet is a collection that stores elements in a sorted order. It is based on a Red-Black tree,
        // which is a type of self-balancing binary search tree. The elements are ordered according to their
        // natural ordering,or by a Comparator provided at set creation time, depending on which constructor is used.

        Set<String> fruits = new TreeSet<String>();
        TreeSet<String> fruits1 = new TreeSet<String>();

        //Key Points About TreeSet
        //Sorted Order: Maintains elements in ascending order.
        //No Duplicates: Does not allow duplicate elements.
        //Null Elements: Does not allow null elements.
        //NavigableSet: Implements the NavigableSet interface, providing additional methods to navigate the set.
        //Performance: Provides guaranteed log(n) time cost for basic operations (add, remove, and contains).

        //Add Items
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Pear");
        fruits1.add("Mango");
        System.out.println(fruits1);
        System.out.println("-------------------------------------");

        //Accessing Items -> since TreeSet implements the SortedSet interface, you can access
        // the first and last elements using first and last methods, respectively.
        System.out.println(fruits1.first());
        System.out.println(fruits1.last());
        System.out.println("-------------------------------------");

        //TreeSet has all elements which HashSet has such as remove,clear,isEmpty, etc.

        //Loop TreeSet
        for (String fruit: fruits1){
            System.out.println(fruit);
        }

        System.out.println("-------------------------------------");

        //Iteration
        Iterator<String> iterator = fruits1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
