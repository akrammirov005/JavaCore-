package OOP.Inheretence.InheritanceExplamation;

public class CarRunner {
    public static void main(String[] args) {
        //Java Inheritance (Subclass and Superclass)
        //In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
        //subclass (child) - the class that inherits from another class
        //superclass (parent) - the class being inherited from
        //There is not multiInheritance in Java

        //SuperCalc calc = new SuperCalc();
        //int r1 = calc.add(10,10);
        //int r2 = calc.sub(15,10);
        //int r3 = calc.multip(5,10);
        //int r4 = calc.divid(10,5);
        //System.out.println("Add: " + r1 + " Sup: " + r2 + " Multip: " + r3 + " Divid: " + r4);

        VerySuperCalc calc = new VerySuperCalc("Akram");
        int r1 = calc.add(10,10);
        int r2 = calc.sub(15,10);
        int r3 = calc.multip(5,10);
        int r4 = calc.divid(10,5);
        double r5 = calc.power(2,3);
        System.out.println(calc.ownerName);
        System.out.println("Add: " + r1 + " Sup: " + r2 + " Multip: " + r3 + " Divid: " + r4 + " Pow: " + (int) r5);

        //Method Overriding -> overwrite the method which is in superclass:
        calc.showCalculatorType();

    }
}
