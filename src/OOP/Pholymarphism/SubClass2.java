package OOP.Pholymarphism;

public class SubClass2 extends Parent{
    public void print(){
        System.out.println("This is SubClass2");
    }

    //Can not call this method if type specified as Parent :)
    public void printHello(){
        System.out.println("Hello there!");
    }
}
