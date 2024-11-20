package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args){
        //ArrayListCollection: An ordered collection (also known as a sequence). Lists can contain duplicate elements.
        // Examples include ArrayList, LinkedList, and VectorCollection.

       //ArrayList -> two type of declaration
        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> arrayList1 = new ArrayList<String>();
        System.out.println("-------------------------------------");

        //Add Item
        arrayList1.add("Apple");
        arrayList1.add("Banana");
        arrayList1.add("Peach");
        System.out.println(arrayList1);
        System.out.println("-------------------------------------");


        //Get index of Item
        System.out.println(arrayList1.indexOf("Apple"));
        System.out.println("-------------------------------------");

        //Access an Item
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(2));
        System.out.println("-------------------------------------");

        //Change an Item
        arrayList1.set(1,"Watermelon");
        arrayList1.set(2,"Mango");
        System.out.println(arrayList1);
        System.out.println("-------------------------------------");

        //Remove an Item
        arrayList1.remove(0);
        System.out.println(arrayList1);
        System.out.println("-------------------------------------");

        //Remove All Items
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println("-------------------------------------");

        //Size of Array
        System.out.println(arrayList1.size());
        System.out.println("-------------------------------------");


        //for loop
        arrayList.add("Apple");
        arrayList.add("Pear");
        arrayList.add("Peach");

        for (int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------------------------------------");

        //Enhanced loop
        for(String array:arrayList){
            System.out.println(array);
        }
        System.out.println("-------------------------------------");

        // Iterator
        Iterator<String> array = arrayList.iterator();
        while(array.hasNext()){
            System.out.println(array.next());
        }


    }
}
