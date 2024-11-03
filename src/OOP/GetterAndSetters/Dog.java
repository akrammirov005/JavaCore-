package OOP.GetterAndSetters;

import java.util.Arrays;

public class Dog {
   private String dogName;
   private String ownerName;
   private double weight;


    public Dog(String dog, String owner, double weight){
        this.dogName = dog;
        this.ownerName = owner;
        this.weight = weight;
    }

    //Setter
    public void setWeight(double newWeight){
        if (newWeight < 1 ){
            this.weight = 5;
        }else{
            this.weight = newWeight;
        }
    }

    //Getter
    public double getWeight(){
        return this.weight;
    }
    public String getOwner(){
        return "Mr " + this.ownerName;
    }
    public String getDog(){
        return this.dogName;
    }

    //Method Feed
    public void feed(String owner,String ...dogfeed){
        System.out.printf("\nThe %s gave his dog the %s.", owner, Arrays.toString(dogfeed));
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", weight=" + weight +
                '}';
    }

}
