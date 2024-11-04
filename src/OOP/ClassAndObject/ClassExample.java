package OOP.ClassAndObject;

//Class -> is a design of Object
//it has attributes and methods
public class ClassExample {
    String name;
    String surname;
    int age;

    String getAllInfo(){
        return "My name is " + this.name + " and my surname is " + this.surname + ". My age is " + this.age + " .";
    }
    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("Age : " + this.age);
    }
}
