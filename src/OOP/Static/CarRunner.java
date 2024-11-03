package OOP.Static;

import java.util.Arrays;

public class CarRunner {
    public static void main(String[] args){
        Car mercedes = new Car("Mercedes");
        System.out.println(mercedes.getCarNumber());
        Car bmw = new Car("BMW");
        System.out.println(bmw.getCarNumber());
        //can be called by class
        //static attribute
        System.out.println(Car.carNumber);
        //static method
        Car.brandCars();
        //Constant;
        System.out.println(Car.BMW_INFO);
        //Array
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTION));
    }
}
