package OOP.ClassAndObject;

public class ObjectExample {
    public static void main(String[] args){
        //This is Object;
        //Object is used to get and set all methods and attributes
        ClassExample object1  = new ClassExample();
        object1.name = "Akram";
        object1.surname = "Mirov";
        object1.age = 18;

        String getClassInfo = object1.getAllInfo();
        System.out.println(getClassInfo);
        object1.printInfo();
    }
}
