package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
        //Set: A collection that cannot contain duplicate elements. It models the mathematical set abstraction.
        // Examples include HashSet, LinkedHashSet, and TreeSet.

        //HashSet

        //A HashSet is a part of the Java Collections Framework and implements the Set interface.
        // It is backed by a hash table (actually a HashMap instance),
        // and it doesn’t allow duplicate elements. The primary characteristics of a HashSet are:
        //No Duplicate Elements
        //Unordered
        //Can use almost same as List
        Set<String>  fruit = new HashSet<String>();
        HashSet<String> fruit1 = new HashSet<String>();
        System.out.println("-------------------------------------");

        //Add Items
        //No Duplicate Elements
        fruit1.add("Avacado");
        fruit1.add("Apple");
        fruit1.add("Pear");
        fruit1.add("Avacado");
        System.out.println(fruit1);
        System.out.println("-------------------------------------");

        //Check If an Item Exists
        System.out.println(fruit1.contains("Apple"));
        System.out.println("-------------------------------------");

        //Remove Items
        fruit1.remove("Apple");
        System.out.println(fruit1);
        System.out.println("-------------------------------------");

        //HashSet Size
        int size = fruit1.size();
        System.out.println(size);
        System.out.println("-------------------------------------");

        //isEmpty -> check if a HashSet is empty
        Boolean isHashEmpty = fruit1.isEmpty();
        System.out.println(isHashEmpty);
        System.out.println("-------------------------------------");


        //Remove All Items
        fruit1.clear();
        System.out.println(fruit1);
        System.out.println("-------------------------------------");


        //Loop Through a HashSet
        fruit.add("Avacado");
        fruit.add("Apple");
        fruit.add("Pear");
        System.out.println(fruit);

        for (String f: fruit){
            System.out.println("HashSet : " + f);
        }
        System.out.println("-------------------------------------");

        //Other Types
        //Items in an HashSet are actually objects. In the examples above, we created items (objects) of type "String".
        // Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an
        // equivalent wrapper class: Integer.For other primitive types, use: Boolean for boolean, Character for char,
        // Double for double, etc.:

        HashSet<Integer> numbers = new HashSet<Integer>();
        HashSet<Double> floatnumbers = new HashSet<Double>();
        HashSet<Boolean> bool = new HashSet<Boolean>();
        HashSet<Character> character = new HashSet<Character>();

    }
}
