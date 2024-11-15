package OOP.Enum;

public enum LaptopEnum {
    //These attribute is look like Object
    HP(1000),MAC(5000),ASUS,SURFACE(3000);

    private int price;

    //Only in Enums constructors can be private
    private LaptopEnum(){
        this.price = 500;
    }

    private LaptopEnum(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
