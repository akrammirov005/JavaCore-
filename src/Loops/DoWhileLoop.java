package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //do{}while(condition) -> is used when we need to run code one time even if the condition is false;

        /*----------------Do While Loop-----------------------*/
        //Example #1
        int count = 0;

        do{
            System.out.println("Count = " + count);
            count++;
        }while(count < 10);

        //Example #2
        int i = 5;

        do{
            System.out.println("Hi " + i);
            i++;
        }while(i <= 4);

    }
}
