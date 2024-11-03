package OOP.DependecyInjecion;

import  OOP.Cat;
import OOP.GetterAndSetters.Dog;

public class DependecyInjection {
    Cat cat;
    Dog dog;

    public DependecyInjection(Cat catClass, Dog dogClass ){
        this.cat = catClass;
        this.dog = dogClass;
    }

    public void feed(){
        cat.feed("Yuri","fish","cola");
        dog.feed("Valodya","steak","bread");
    }

}
