package OOP.ClassAndObject;

public class ObjectExample {
    public static void main(String[] args){
        //This is Object;
        //Object is used to get or set all methods and attributes
        //we can create several exampliar or object of class
        ClassExample object1  = new ClassExample();
        object1.name = "Akram";
        object1.surname = "Mirov";
        object1.age = 18;

        String getClassInfo = object1.getAllInfo();
        System.out.println(getClassInfo);
        object1.printInfo();

        ClassExample object2 = new ClassExample();
        object2.name = "Ahmad";
        object2.surname = "Mirov";
        object2.age = 17;

       String getClassInfo2 =  object2.getAllInfo();
       System.out.println(getClassInfo2);
       object2.printInfo();


    }
}
