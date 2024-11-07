package DataTypes.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        System.out.println("--------Arrays");

        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        //To declare an array, define the variable type with square brackets:
        String[] car1; // -> first way;  datatype[] variable;
        String car2[]; // -> second way; datatype variable[];
        int[] car3 = new int[2];//-> third method; datatype[] variable = new datatype[length of data]


        System.out.println("--------Inserting data");

        //Inserting data;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));
        //------------------------------------------
        int[] carsPrice  = new int[2];
        carsPrice[0] = 200;
        carsPrice[1] = 300;
        System.out.println(Arrays.toString(carsPrice));

        //------------------------------------------
        int[] carsYear = new int[]{2005,2006};
        System.out.println(carsYear[1]);
        System.out.println(Arrays.toString(carsYear));

        System.out.println("--------Access the Elements of an Array");

        //Access the Elements of an Array
        //You can access an array element by referring to the index number.
        // Array indexes start with 0: [0] is the first element. [1] is the second element.
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);


        System.out.println("--------Change an Array Element");

        //Change an Array Element
        //To change the value of a specific element, refer to the index number.
        cars[0] = "Lada";
        cars[1] = "Mercedes";
        cars[2] = "Toyota";
        cars[3] = "Ferrari";
        System.out.println(Arrays.toString(cars));


        System.out.println("--------Array Length");


        //Array Length
        //To find out how many elements an array has, use the length property.
        int carLength = cars.length;
        System.out.println(carLength);
    }
}
