package DataTypes.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        System.out.println("--------Multidimensional Arrays");
        //Multidimensional Arrays //2d array -> [][]  //3d array -> [][][]  :)
        //A multidimensional array is an array of arrays.
        //Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
        int[][] myNumbers = {{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int myNumbers2[][] = {{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int myNumbers3[][] = new int[3][4];

        for (int i = 0; i < myNumbers3.length;i++){
            for (int j = 0; j < myNumbers3[i].length; j++) {
                myNumbers3[i][j] = (int)(Math.random()*10);
            }
            System.out.println(Arrays.toString(myNumbers3[i]));
        }


        System.out.println("--------Access Elements");

        //Access Elements
        //To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array.
        //This example accesses the third element (2) in the second array (1) of myNumbers:
        System.out.println(myNumbers[0][1]);
        System.out.println(myNumbers2[1][2]);
        System.out.println(myNumbers3[2][3]);

        System.out.println("--------Change Element Values");
        //Change Element Values
        myNumbers[0][2] = 5;
        myNumbers2[1][3] = 6;
        System.out.println(Arrays.toString(myNumbers[0]));
        System.out.println(Arrays.toString(myNumbers2[1]));


        System.out.println("--------Loop Through a Multi-Dimensional Array");
        //Loop Through a Multi-Dimensional Array
        //You can also use a for loop inside another for loop to get the elements of a two-dimensional array
        for (int i = 0; i < myNumbers.length;i++){
            System.out.print("[");
            for (int j = 0; j < myNumbers[i].length; j++){
                System.out.print(myNumbers[i][j] + ",");
            }

            System.out.println("]");
        }
        //Or you could just use a for-each loop, which is considered easier to read and write
        for (int[] array:myNumbers2){
            for (int num: array){
                System.out.print(num + " ,");
            }
            System.out.println(" -> array");
        }



    }
}
