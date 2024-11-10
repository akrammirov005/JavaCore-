package OOP.Inheretence.InheritanceExplamation;

//This is MultiLevelInheritance
public class VerySuperCalc extends SuperCalc{

    public VerySuperCalc(String ownerName){
        super(ownerName);
    }

    public double power(int n1,int n2){
        return Math.pow(n1 ,n2);
    }

    //Method Overriding
    public void showCalculatorType(){
        System.out.println("This is a VerySuperCalc");
    }
}
