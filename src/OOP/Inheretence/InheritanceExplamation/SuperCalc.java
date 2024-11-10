package OOP.Inheretence.InheritanceExplamation;

//class extends from Calc using word extends
//This is SingleLevelInheritance
public class SuperCalc extends Calc{

    public SuperCalc(String ownerName){
        //used to give the value to supclass's attribute
        super(ownerName);
    }

    public int multip(int n1 , int n2){
        return n1 * n2;
    }
    public int divid(int n1,int n2){
        return n1 / n2;
    }

    //When overriding a method, you might want to use the @Override annotation that instructs the
    // compiler that you intend to override a method in the superclass. If, for some reason, the compiler
    // detects that the method does not exist in one of the superclasses, then it will generate an error.
    //@Override
    //Method Overriding
    public void showCalculatorType(){
        System.out.println("This is a SuperCals");
    }
}
