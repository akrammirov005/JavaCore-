package OOP.DependecyInjecion;

import OOP.Cat;
import OOP.GetterAndSetters.Dog;

public class DependecyInjectionRunner {
    public static void main(String[] args){
        Cat cat = new Cat("Catty","black",5.20,"Yuri");
        Dog dog = new Dog("Doggy","Volodya",15.5);

        DependecyInjection zoo = new DependecyInjection(cat,dog);
        zoo.feed();
        System.out.println(zoo.cat);
        System.out.println(zoo.dog);

    }
}
