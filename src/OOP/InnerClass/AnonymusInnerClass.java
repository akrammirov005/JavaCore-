package OOP.InnerClass;

class OuterClass{
    public void print(){
        System.out.println("Outer Class");
    }
}

abstract class OuterAbstractClass{
    public abstract void print();
    public abstract void show();
}

public class AnonymusInnerClass {
    public static void main(String[] args) {
        // An anonymous inner class can be useful when making an instance of an object with certain “extras”
        // such as overriding methods of a class or interface, without having to actually subclass a class.
        //mostly used to override the method by not creating extra class

        OuterClass obj = new OuterClass(){
            //@Override
            public void print(){
                System.out.println("Anonymus Inner Class");
            }
        };
        obj.print();

        //Abstract and Anonymus Class

        OuterAbstractClass obj2 = new OuterAbstractClass() {
            //@Override
            public void print() {
                System.out.println("Anonymus Inner Abstract Class");
            }

            //@Override
            public void show() {
                System.out.println("in Anonymus Inner class");
            }
        };
        obj2.print();
        obj2.show();


    }
}
