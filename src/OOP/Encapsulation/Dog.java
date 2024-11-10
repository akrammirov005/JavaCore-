package OOP.Encapsulation;

import java.util.Arrays;

public class Dog {
   //Encapsulation
   //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
   //declare class variables/attributes as private
   //provide public get and set methods to access and update the value of a private variable
   private String dogName;
   private String ownerName;
   private double weight;


    public Dog(String dog, String owner, double weight){
        this.dogName = dog;
        this.ownerName = owner;
        this.weight = weight;
    }

    //Setter -> used to set value in attribute/variable
    public void setWeight(double newWeight){
        if (newWeight < 1 ){
            this.weight = 5;
        }else{
            this.weight = newWeight;
        }
    }

    //Getter -> used to get the value of attribute/variable
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
