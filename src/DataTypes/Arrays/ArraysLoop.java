package DataTypes.Arrays;

public class ArraysLoop {
    public static void main(String[] args) {
        //You can loop through the array elements with the for loop,
        // and use the length property to specify how many times the loop should run.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car : " + cars[i] + ", index: " + i);
        }

        //Loop Through an Array with For-Each or enhanced loop
        /*for (type variable : arrayname) {
          ...
        */

        for (String car : cars) {
            System.out.println(car);
        }


    }
}

