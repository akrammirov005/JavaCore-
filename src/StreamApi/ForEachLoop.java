package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,6,3,4,8,9,7);

        //Creating foreach with implementation interface
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        nums.forEach(con);

        //creating forEach without implementation

        List<String> names = Arrays.asList("Akram","Sam","Anna","Em");
        names.forEach(n -> System.out.println(n));
    }
}
