package Exceptions;

public class Throw {

    public static void checkAge(int age){
        if (age != 18)
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        else
            System.out.println("Access granted");
    }

    public static void main(String[] args) {
        //The throw statement is used together with an exception type.
        // There are many exception types available in Java: ArithmeticException,
        // FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.:

        //checkAge(15);

        int i =0;
        int j =0;

        try{
            j = 18 / i;
            if (j == 0){
                throw new ArithmeticException("You have arithmetic error");
            }
        }catch (ArithmeticException e){
            //we can rewrite code inside catch block
            j = 18/5;
            System.out.println("Arithmetic Exception message :  " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception message : " + e);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
    }
}
