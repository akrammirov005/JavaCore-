package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        //Stream API is used to process collections of objects.
        // A stream in Java is a sequence of objects that supports various
        // methods that can be pipelined to produce the desired result.

        //The uses of Stream in Java are mentioned below:
        //Stream API is a way to express and process collections of objects.
        //Enable us to perform operations like filtering, mapping, reducing, and sorting.

        List<Integer> numbers = Arrays.asList(5,3,6,4,9,8,2);
        System.out.println(numbers);

        //making copy of Collection
        Stream<Integer> s1 = numbers.stream();
        //Filtering list
        Stream<Integer> s2 = s1.filter(s -> s%2 == 0);
        //Mapping list -> means we can do any operation with each item of list
        Stream<Integer> s3 = s2.map(s -> s * 2);
        //Sort
        Stream<Integer> s4 = s3.sorted();
        //Reduce
        int result = s3.reduce(0,(c,e) -> c + e);
        System.out.println(result);

        int result2 = numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n * 2)
                .reduce(0,(c,e) -> c + e);

        System.out.println(result2);



        //s4.forEach(s -> System.out.println(s));



    }
}
