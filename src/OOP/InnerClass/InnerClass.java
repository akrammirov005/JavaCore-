package OOP.InnerClass;

class A{
    int age = 20;

    public void showOuterClass(){
        System.out.println("Outer Class A");
    }

    class B{
        public void showInnerClass(){
            System.out.println("Inner Class B");
        }
        public int getOuterAttribute(){
            return age;
        }
    }

    static class C{
        public void showInnerStaticClass(){
            System.out.println("Inner Static Class C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        //The purpose of nested classes(a class within a class) is to group classes that belong together, which makes your code more readable and maintainable.
        //To access the inner class, create an object of the outer class, and then create an object of the inner class:
        A obj = new A();
        obj.showOuterClass();

        A.B obj1 = obj.new B();
        obj1.showInnerClass();

        //An inner class can also be static, which means that you can access it without creating an object of the outer class:
        A.C obj2 = new A.C();
        obj2.showInnerStaticClass();

        //One advantage of inner classes, is that they can access attributes and methods of the outer class:
        System.out.println(obj1.getOuterAttribute());
    }
}
