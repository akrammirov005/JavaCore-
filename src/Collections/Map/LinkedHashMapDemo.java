package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
        // HashMap provided the advantage of quick insertion, search, and deletion, but it never maintained the track and order of insertion,
        // which the LinkedHashMap provides where the elements can be accessed in their insertion order.

        //Features of a LinkedHashMap:
        //A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class.
        //It contains only unique elements.
        //It may have one null key and multiple null values.
        //It is non-synchronized.
        //It is the same as HashMap with an additional feature that it maintains insertion order.
        //For example, when we run the code with a HashMap, we get a different order of elements.

        Map<String,Integer> amountOfProducts = new LinkedHashMap<>();
        LinkedHashMap<String,String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("America","Washington");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("China","Beijing");
        capitalCities.put("Tajikistan","Dushanbe");
        System.out.println(capitalCities);
        System.out.println("-------------------------------------");

    }
}
