package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //Logical operators are used to compare more than one comparison;
        //AND -> &&
        //OR -> ||
        //NOT -> !
        int a = 10;
        int b = 20;
        int c = 15;
        int d = 16;
        boolean result;

        //&&(and)
        //true && true -> true;
        //true && false -> false;
        //false && false -> false;
        result = a < b && c < d;
        System.out.println(result);

        // ||(or)
        //true || true -> true;
        //true || false -> true;
        //false || false -> false
        result = a < b || c > d;
        System.out.println(result);

        // !(not)
        //!true -> false;
        //!false -> true;
        result = a > d;
        System.out.println(!result);

    }
}
