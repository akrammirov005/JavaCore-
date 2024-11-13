package OOP.Interface.MultipleInheritence;

interface Parent{
    void see();
}

interface A extends Parent{
    void jump();
    void stand();
}
interface B extends Parent{
    void hunt();
}


class Animal implements A,B{
    public void jump(){
        System.out.println("Something is jumping");
    }
    public void stand(){
        System.out.println("Something is runnig");
    }
    public void hunt(){
        System.out.println("Something is hunting");
    }
    public void see(){
        System.out.println("Something is seeing");
    }
}

public class MultipleInhritenceRunner  {
    public static void main(String[] args) {
        //Class - Class -> extends;
        //Class - Interface -> implement;
        //Interface - Interface -> extends;

        //Multiple Inheritance
        // In Java, multiple inheritances are not allowed, however, you can use an interface to make
        // use of it as you can implement more than one interface.
        //Interfaces also like class can inherit another interface
        //and also interface can extend more than one interface
        Animal obj = new Animal();
        obj.stand();
        obj.jump();
        obj.hunt();
        obj.see();
    }
}
