import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
       /*-----------------1-Method-----------------*/

//        int[] array = new int[2];
//        array[0] = x;
//        array[1] = y;
//        System.out.println(Arrays.toString(array));
//
//        /*-----------------2-Method-----------------*/

//        int[] array = new int[]{x,y};
//        System.out.println(array[1]);
//        System.out.println(Arrays.toString(array));


         /*-----------------2-Method-----------------*/

        int[] array = {x , y};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0] + " and " + array[1]);

        /*------------------2d lists - Multiple lists ------------------*/
        int[] listPeople = {155,120,130,145};
        int[] listPeople2 = {255,350,450,650};
        int[][] multippleLists = {listPeople,listPeople2};
        System.out.println(multippleLists[0][2]);


    }
}
