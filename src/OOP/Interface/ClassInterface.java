package OOP.Interface;

//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements
//keyword (instead of extends). The body of the interface method is provided by the "implement" class
public class ClassInterface implements Interface {

    //@Override
    public void run() {
        System.out.println("Something is running");
    }

    //@Override
    public void stop() {
        System.out.println("Something has stopped");
    }

}
