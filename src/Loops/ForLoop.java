package Loops;

public class ForLoop {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 4; i++){
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + " -- " + (j + 9));
            }
        }

        //using for loop for arrays;

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        /*----------------ForEach--------------------*/
        for(int array_item:array){
            System.out.println(array_item);
        }

        /*----------------For-----------------------*/
        for(int i =0; i < array.length; i++){
            System.out.println("index = " + i);
            System.out.println("array = " + array[i]);
        }

        System.out.println("-------------------------------------");

        /*----------------For Loop Task-----------------------*/
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("array = " + array[i]);
                System.out.println("index = " + i);
            }
        }

        /*---------------Multiple ArrayListCollection ----------------------*/
        int[] listPeople = {120,150,160,178};
        int[]listPeople2 = {102,105,205,180};
        int[][] multipleLists = {listPeople,listPeople2};

        upperFor:
        for (int[] list:multipleLists){
            for (int number:list){
                if(number == 178){
                    System.out.println("We have found suitable guy");
                    break upperFor;
                }else{
                    System.out.println("Not suitable guy");
                }
            }
        }


        /*---------------continue ----------------------*/

        int[] results = {2,4,3,5,6,1};
        for (int result:results){
            System.out.println(result);
            if(result == 6){
                continue;
            }
            System.out.println("I made push up");
        }
    }
}
