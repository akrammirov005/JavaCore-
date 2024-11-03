package OOP.Inheretence;

//abstract -> means we can not make examplyar of this class
public abstract class Dog extends Alive {
    //final means we can not change this attribute
    public final int countPaws = 4;
    public int countTeeth;

    //When we make constructor in our abstract class ,
    // the other class which inherit this class will also have the constructor
    public Dog(int countTeeth){
        this.countTeeth = countTeeth;
    }

    public void bark(){
        System.out.println("The dog is barking");
    }

    public void beAngry(){
        System.out.println("The dog is very angry");
    }

    //When we use final in method it is mean we can not change this method in Child Classes
    public final void eat(){
        System.out.println("The dog is eating");
    }

    //abstract method -> means the classes which inherit this class must have this method with their own realization
    public abstract void run();

}
