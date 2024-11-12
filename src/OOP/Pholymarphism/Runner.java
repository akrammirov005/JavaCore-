package OOP.Pholymarphism;

public class Runner{
    public static void main(String[] args) {

        //Polymorphism -> meaning "many forms"
        //In Java Polymorphism is mainly divided into two types:
        //Compile-time Polymorphism -> It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading.Method Overloading
        //Runtime Polymorphism -> currently has been implemented,
        //It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime.

        Parent obj = new SubClass1();
        obj.print();
        Parent obj2 = new SubClass2();
        obj2.print();

    }
}
