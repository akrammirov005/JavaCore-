package OOP.Interface;

public class Runner {
    public static void main(String[] args) {
        //Interfaces
        //Another way to achieve abstraction in Java, is with interfaces.
        //An interface is a completely "abstract class" that is used to group related methods with empty bodies;
        ClassInterface obj = new ClassInterface();
        obj.run();
        obj.stop();
        //Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
        //Interface methods do not have a body - the body is provided by the "implement" class
        //On implementation of an interface, you must override all of its methods
        //An interface cannot contain a constructor (as it cannot be used to create objects);

        //Access to interface attribute
        System.out.println(ClassInterface.name);
        System.out.println(Interface.age);



    }
}
