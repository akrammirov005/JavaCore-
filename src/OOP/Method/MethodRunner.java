package OOP.Method;

public class MethodRunner {
    public static void main(String[] args) {
        System.out.println("-------Method");
        Method method1 = new Method();
        //To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
        method1.myMethod();
        //A method can also be called multiple times:
        method1.myMethod();
        method1.myMethod();

        System.out.println("-------Parameters and Arguments");

        //When a parameter is passed to the method, it is called an argument.
        //So, from the example below: username and password are parameters, while akram020 and 123456789 are arguments.
        //The order of arguments should be exactly as parameters
        method1.printMethod("akram020" , "123456789");

        System.out.println("-------Return Values");

        //Return Values
        System.out.println(method1.returnMethod(50));
        //You can also store the result in a variable (recommended, as it is easier to read and maintain):
        int result = method1.returnMethod(150);
        System.out.println("Retun value : " + result);


        System.out.println("-------Method Overloading");

        //Method Overloading
        System.out.println("String : " + method1.overloadMethod("Akram","Mirov"));
        System.out.println("Int : " + method1.overloadMethod(20,20));
        System.out.println("Double : " + method1.overloadMethod(15.5,20.6));



    }
}
