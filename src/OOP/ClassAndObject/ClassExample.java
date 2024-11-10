package OOP.ClassAndObject;

//Class -> is a design of Object
//it has attributes and methods
public class ClassExample {
    String name;
    String surname;
    int age;

    //constructor -> 2 type
    //#1 default constructor
    public ClassExample(){
        this.name = "John";
        this.surname="Willson";
        this.age = 25;
    }

    //#2 parametrized constructor
    public ClassExample(String name,String surname,int age){
        this.name = name;
        this.surname=surname;
        this.age = age;
    }

    public String getAllInfo(){
        return "My name is " + this.name + " and my surname is " + this.surname + ". My age is " + this.age + " .";
    }
    public void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("Age : " + this.age);
    }
}
