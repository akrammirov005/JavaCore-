package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //In Java, Map Interface is present in java.util package represents a mapping between a key and a value.
        // Java Map interface is not a subtype of the Collection interface.
        // Therefore, it behaves a bit differently from the rest of the collection types. A map contains unique keys.
        //A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
        //One object is used as a key (index) to another object (value). It can store different types:
        // String keys and Integer values, or the same type, like: String keys and String values:
        Map<String,Integer> amountOfProducts = new HashMap<>();
        HashMap<String,String> capitalCities = new HashMap<>();

        //Add Items
        capitalCities.put("America","Washington");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("China","Beijing");
        capitalCities.put("Tajikistan","Dushanbe");
        System.out.println(capitalCities);
        System.out.println("-------------------------------------");

        //Access Items by Key
        System.out.println(capitalCities.get("America"));
        System.out.println(capitalCities.get("Russia"));
        System.out.println(capitalCities.get("China"));
        System.out.println("-------------------------------------");

        //Remove Items
        capitalCities.remove("America");
        capitalCities.remove("Russia");
        System.out.println(capitalCities);
        System.out.println("-------------------------------------");

        //HashMap Size
        System.out.println(capitalCities.size());
        System.out.println("-------------------------------------");

        //Remove all Items
        capitalCities.clear();
        System.out.println(capitalCities);
        System.out.println("-------------------------------------");

        //Loop Through a HashMap
        //Use the keySet() method if you only want the keys, and use the values() method if you only want the values


        capitalCities.put("America","Washington");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("China","Beijing");
        capitalCities.put("Tajikistan","Dushanbe");

        //KeySet
        for (String key:capitalCities.keySet()){
            System.out.println("Name of Country : " + key);
        }
        System.out.println("-------------------------------------");

        //Values
        for (String value: capitalCities.values()){
            System.out.println("Name of Capital : " + value);
        }

        //get the key and value
        for (String key: capitalCities.keySet()){
            System.out.println("Country : " + key + " -> Capital : " + capitalCities.get(key));
        }
    }
}
