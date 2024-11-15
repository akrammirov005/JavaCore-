package OOP.Lambda;

@java.lang.FunctionalInterface
interface C{
    void showNumbers(int i,int j);
}

@java.lang.FunctionalInterface
interface D{
    int getNumbers(int i ,  int j);
}

public class LambdaExpression {
    public static void main(String[] args) {
        //creating an Anonymus class using C interface:

        C obj = new C(){
            @Override
            public void showNumbers(int i,int j){
                System.out.println("The numbers which you choose is : " + i + " and " + j);
            }
        };
        obj.showNumbers(5,6);

        //Lambda Expressions were added in Java 8.
        //A lambda expression is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in the body of a method.
        //parameter -> expression
        //(parameter1, parameter2) -> expression
        //(parameter1, parameter2) -> { code block }

        //creating Lambda expression using C interface:
        int sum;

        //#Example 1
        C obj1 = (int i,int j) -> System.out.println("The numbers which you choose is : " + i + " and " + j);
        obj1.showNumbers(12,15);
        //#Rturn Example 1
        D obj1Num = (int i,int j) -> i + j;
        sum = obj1Num.getNumbers(20,30);
        System.out.println(sum);


        //#Example 2
        C obj2 = (i,j) -> System.out.println("The numbers which you choose is : " + i + " and " + j);
        obj2.showNumbers(50,60);

        //#Rturn Example 2
        D obj2Num = (i,j) -> i + j;
        sum = obj2Num.getNumbers(60,80);
        System.out.println(sum);


        //# Example 3
        C obj3 = (int i, int j) ->{
            System.out.println("First number : " + i);
            System.out.println("Second number : " + j);
        };
        obj3.showNumbers(10,20);

        //#Rturn Example 3
        D obj3Num = (int i, int j) -> {
            return i + j;
        };
        sum = obj3Num.getNumbers(100,200);
        System.out.println(sum);


    }
}
