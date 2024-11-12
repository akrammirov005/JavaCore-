package OOP.Abstraction;

public class Runner {
    public static void main(String[] args) {
        //Abstraction
        //Data abstraction is the process of hiding certain details and showing only essential information to the user.
        //Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
        //Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
        //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

        SubClass1 obj = new SubClass1();
        obj.print();
        obj.showSubClassName();
    }
}
