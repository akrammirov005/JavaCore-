package OOP;

import java.util.Arrays;

public class Cat {
    //Attribute(Svoistvo,pole)
    String catName;   //Modification of access -> public and private
    String color;
    double weight;
    String ownerName;
    //Initialization Block
    {
        System.out.println("Initialization Block");
    }

    //Constructor
    public Cat(String catNameValue,String colorName, double catWeight,String ownerNameValue){
        this.catName = catNameValue;
        this.color = colorName;
        this.weight = catWeight;
        this.ownerName = ownerNameValue;
    }

    //Method
    public void destroySofa(String sofaOwner){
        //System.out.println("\nCat has destroyed the sofa");
        //System.out.printf("\nCat has destroyed %s's sofa",ownerName);
        System.out.printf("\nCat has destroyed %s's sofa\n",sofaOwner);
    }


    //return
    public String hunt(boolean isDay){
        //if(isDay == true){
        //    return "Mouse";
        //}else{
         //   return "Owl";
        //}
        if(isDay){
            return "Mouse";
        }
        return "Owl";
    }

    //Overload and Signature of method;
    public String hunt(boolean isSuccessful,boolean isDay){
    if(isSuccessful){
        if (isDay){
            return "Mouse";
        }
        return "Owl";
    }
    return "Nothing";
    }

    public void hunt(String timesDay){
        if(timesDay.equals("Day")){
            System.out.println("Mouse");
        }else{
            System.out.println("Owl");
        }
    }

    //varArgs -> another arguments should come before varArgs
    public void feed(String owner , String ...catfeed){
        System.out.printf("The %s gave his cat the %s.", owner, Arrays.toString(catfeed));
    }


    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
