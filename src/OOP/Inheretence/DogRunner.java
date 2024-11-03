package OOP.Inheretence;

public class DogRunner {
    public static void main(String[] args){
        //Parent Class -> which other classes inherit;
        //Dog dog = new Dog();
        //dog.bark();

        System.out.println("----------------------------");
        //Child class -> which  can  inherit  class but no more than 1;
        Poodle poodle = new Poodle();
        poodle.bark();
        System.out.println(poodle.countPaws);
        poodle.run();
        poodle.breathe();
        poodle.beAngry();
        System.out.println(poodle.countTeeth);
        poodle.eat();


        System.out.println("----------------------------");

        //Child class
        Shpridle shpridle = new Shpridle();
        shpridle.bark();
        System.out.println(shpridle.countPaws);
        shpridle.run();
        shpridle.breathe();
        shpridle.beAngry();
        System.out.println(shpridle.countTeeth);
        shpridle.eat();
    }
}
