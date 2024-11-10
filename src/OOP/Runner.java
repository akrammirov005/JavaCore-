package OOP;

public class Runner {
    public static void main(String[] args){
        //class instance -> экземпляр класса
        Cat cat = new Cat("Kitty","black",10.6,"Mark");
        System.out.println(cat);
        //Attributes
        System.out.println(cat.catName);
        System.out.println(cat.color);
        System.out.println(cat.weight);
        System.out.println(cat.ownerName);
        cat.color = "white";
        System.out.print(cat.color);

        //Method;
        cat.destroySofa("Mark");

        //Return
        String animal =  cat.hunt(true);
        String newHunt = cat.hunt(false,true);
        cat.hunt("Night");
        System.out.println(newHunt);

        //varArgs
        cat.feed("Steven","fish","bread","water");



    }
}
