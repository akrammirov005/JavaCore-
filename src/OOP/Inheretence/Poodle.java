package OOP.Inheretence;

public class Poodle extends Dog{

    //Child class constructor
    public Poodle(){
        //used to give vbalue to abstract class attriute
        super(25);
    }
    public void run(){
        System.out.println("Poodle is running");
    }
    @Override
    public void breathe(){
        System.out.println("Poodle is breathing");
    }
}
