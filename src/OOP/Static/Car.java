package OOP.Static;

import java.util.Arrays;

//static make our attribute or method to be common;
public class Car {
    private String carName;
    //static attribute
    public static int carNumber = 0;
    //Constant -> value will not chang under any circumstance;
    public final static  String BMW_INFO = "This is information about BMW car";
    public final static String MERCEDES_INFO = "This is information about Mercedes car";
    public final static String AUDI_INFO = "This is information about Audi car";
    public final static String[] BRAND_DESCRIPTION = new String[3];
    //Static Initialization
    static {
        BRAND_DESCRIPTION[0] = BMW_INFO;
        BRAND_DESCRIPTION[1] = MERCEDES_INFO;
        BRAND_DESCRIPTION[2] = AUDI_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTION));
    }

    public Car(String carName){
        this.carName = carName;
        carNumber++;
    }

    public int getCarNumber(){
        return carNumber;
    }

    //static method;
     public static void brandCars(){
         System.out.println("Car brands : audi,  mercedes, bmw; Currently have cars : " + carNumber);
     }

}
