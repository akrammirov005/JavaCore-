package OOP.Enum;

public class ColorClass {
    //We can also create enum inside class
    //public enum Color{
        //BLUE,RED,WHITE,BLACK
    //}
    public static void main(String[] args) {
        //Class Type: Every enum is internally implemented using the Class type.
        //Enum Constants: Each enum constant represents an object of type enum.
        //Switch Statements: Enum types can be used in switch statements.
        //Implicit Modifiers: Every enum constant is implicitly public static final. Since it is static,it can be accessed using the enum
        // name. Since it is final, enums cannot be extended.
        //Main Method: Enums can declare a main() method, allowing direct invocation from the command line.
        //Enum also has constructor and method except attribute
        //Inheritance not allowed in Enum

        ColorEnum red = ColorEnum.RED;
        System.out.println(red);
        //Shows the enum index
        System.out.println(red.ordinal());

        //Thus we are able to get all values:
        ColorEnum[] colorArray = ColorEnum.values();
        System.out.println(colorArray[2]);

        //showing all values using for
        for(ColorEnum c : colorArray){
            System.out.println(c + " : " + c.ordinal());
        }

        //We can use "if" but here I will use switch:
        ColorEnum color = ColorEnum.BLUE;

        switch(color){
            case RED:
                System.out.println("This is Red color");
                break;
            case BLUE:
                System.out.println("This is Blue color");
                break;
            case BLACK:
                System.out.println("This is Black color");
                break;
            case WHITE:
                System.out.println("This is White color");
                break;
            default:
                System.out.println("There is not such color");
                break;
        }

        System.out.println("-----------------------------------");

        //Created an Enum with constructor
        LaptopEnum lap = LaptopEnum.HP;
        System.out.println(lap + " : " + lap.getPrice());
        lap.setPrice(5050);
        System.out.println(lap.getPrice());

        //using for:
        for(LaptopEnum l : LaptopEnum.values()){
            System.out.println(l + " : " + l.getPrice());
        }

    }
}
