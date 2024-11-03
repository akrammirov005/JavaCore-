package OOP.Inheretence;

//means that this class can not be inherited
public final class  Shpridle extends Dog{

    //Child class constructor
    public Shpridle(){
        //used to give value to abstract class attribute
        super(30);
    }
    @Override
    public void run(){
        System.out.println("Shpridle is running");
    }

    @Override
    public void breathe(){
        System.out.println("Shpridle is breathing");
    }

    @Override//-> used to override the method, will not allow to add anything new
    public void bark(){
        System.out.println("Shpridle is barking loud");
    }

    @Override
    public void beAngry(){
        System.out.println("The dog has " + super.countPaws + " paws");
        System.out.println("The dog saw a person");
        //using super we can use Parent class methods/attribute inside Child class method;
        super.beAngry();
        System.out.println("The dog calm down");
    }
}
