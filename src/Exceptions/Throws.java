package Exceptions;

class A{
    public void show() throws  ArithmeticException{
        int i = 0;
        int j = 0;
        j = 18/i;
        System.out.println(j);
    }
}


public class Throws {
    public static void main(String[] args) {
        //The throws keyword indicates what exception type may be thrown by a method.
        //There are many exception types available in Java: ArithmeticException, ClassNotFoundException,
        // ArrayIndexOutOfBoundsException, SecurityException, etc.
        //Used to indicate what exception type may be thrown by a method
        //	Can declare multiple exceptions

        A obj = new A();
        try {
            obj.show();
        }catch (ArithmeticException e){
            System.out.println("The system -> " + e);
        }
    }
}
