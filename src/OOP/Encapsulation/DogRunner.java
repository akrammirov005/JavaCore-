package OOP.Encapsulation;

public class DogRunner {
    public static void main(String[] args){
        Dog dog = new Dog("Bizzy","Olivia",15.6);
        dog.setWeight(50);
        System.out.println(dog.getWeight());
        System.out.println(dog.getOwner());
        System.out.println(dog.getDog());
        String owner = dog.getOwner();
        dog.feed(owner,"feed1","feed2","feed3");
    }
}
