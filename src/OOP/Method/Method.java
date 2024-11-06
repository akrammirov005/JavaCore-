package OOP.Method;

public class Method {
    //A method is a block of code which only runs when it is called.

    //myMethod() is the name of the method
    //void means that this method does not have a return value
    public void myMethod(){
        System.out.println("Hello World");
    }

    //You can pass data, known as parameters, into a method.
    public void printMethod(String username, String password){
        System.out.println("Username : " + username + " Password : " + password);
    }

    //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void,
    //and use the return keyword inside the method:
    public int returnMethod(int num){
        return 50 + num;
    }

    //Method Overloading
    //With method overloading, multiple methods can have the same name with different parameters:
    // Multiple methods can have the same name as long as the number and/or type of parameters are different.
    public String overloadMethod(String name,String surname) {
        return surname + " " + name;
    }

    public int overloadMethod(int num1 , int num2){
        return num1 + num2;
    }

    public double overloadMethod(double price , double payment){
        return price + payment;
    }
}
