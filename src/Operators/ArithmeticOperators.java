package Operators;

public class ArithmeticOperators {
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        //Plus
        int plus = x + y;
        System.out.println(plus);

        //Minus
        int minus = x - y;
        System.out.println(minus);

        //Multiply
        int multiply = x * y;
        System.out.println(multiply);

        //Division
        int divide = x / y;
        System.out.println(divide);


        //modular operator -> will return remain of division
        int result = x % y;
        System.out.println(result);


        //square
        int sqr = x * x;
        System.out.println(sqr);

        //Divide Float numbers
        y = 3;
        double divideFloat = (double) x / y;
        System.out.println(divideFloat);


        //brief syntax
        //shortcut
        x += 5;
        x -= 5;
        x /= 5;
        x *= 10;


        //increment
        x = x + 1;
        x += 1;
        x++; // post-increment -> fetch the value then increment
        ++x; //pre-increment -> increment then fetch the value
        System.out.println(x);


        //decrement
        x = x - 1;
        x -= 1;
        x--; //post-decrement -> fetch the value then decrement
        --x; //pre-decrement -> decrement then fetch the value
        System.out.println(x);

    }
}
