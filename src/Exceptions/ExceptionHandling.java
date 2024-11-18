package Exceptions;

public class ExceptionHandling {
    public static void main(String[] args){
        //When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
        //When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

        int a = 0;
        int b = 0;

        //The try statement allows you to define a block of code to be tested for errors while it is being executed.
        //checks below code if it has not any errors then it will fulfill otherwise shows error
        try{
            b = 18 / a;
        }
        //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
        catch (Exception e){
            //we should specify and detailed the error
            System.out.println("The error message :  can not devide value to 0" );
        }

        //code below will work despite an error
        System.out.println(b);
    }
}
