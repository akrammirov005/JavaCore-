package Operators;

public class RelationalOperators {
    public static void main(String[] args){
        //Relational Operators -> <, >, ==, !=, <=, >=;
        //Relational will get the values compare them and return boolean data type;
        int a = 5;
        int b = 8;


        //Greater than  a > b;
        boolean result = a > b;
        System.out.println(result);

        //Smaller than a < b;
        result = a < b;
        System.out.println(result);

        //Equal a == b;
        result = a == b;
        System.out.println(result);

        //Not Equal a != b;
        result = a != b;
        System.out.println(result);

        //Greater or Equal a >= b;
        result = a >= b;
        System.out.println(result);

        //Smaller or Equal a<= b;
        result = a <= b;
        System.out.println(result);


        //Comparing of two different types
        int num1 = 20;
        double num2 = 20.5;

        boolean sum = num1 < num2;
        System.out.println(sum);

    }
}
