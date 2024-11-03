package Loops;

public class WhileLoop {
    public static void main(String[] args) {

        /*----------------WhileLoop-----------------------*/

        int count1 = 0;
        while(count1 < 15){
            System.out.println(count1);
            count1++;
        }
        System.out.println("Our first while loop has been counted");

        /*----------------Nested whileLoop-----------------------*/
        int i = 1;
        while(i <= 5){
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        System.out.println("Bye " + i);
    }
}
