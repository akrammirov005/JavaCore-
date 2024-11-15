package OOP.Lambda;



@java.lang.FunctionalInterface
interface A{
    void show();
}

class B implements A{
    @Override
    public void show(){
        System.out.println("Show Method");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        //A functional interface is an interface that contains only one abstract method.
        // They can have only one functionality to exhibit.
        //Functional Interface is additionally recognized as Single Abstract Method Interfaces.
        //Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface.

        //Implemented Interface
        //A obj = new B();
        //obj.show();

        A obj1 = new A(){
            @Override
            public void show() {
                System.out.println("Show Method");
            }
        };
        obj1.show();
    }
}
