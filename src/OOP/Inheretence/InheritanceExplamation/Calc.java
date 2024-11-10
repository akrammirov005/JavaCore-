package OOP.Inheretence.InheritanceExplamation;

public class Calc {
    String ownerName;

    public Calc(String ownerName){
        this.ownerName = ownerName;
    }

    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int sub(int n1,int n2){
        return n1 - n2;
    }

    //Method Overriding
    public void showCalculatorType(){
        System.out.println("This is a Calc");
    }
}
