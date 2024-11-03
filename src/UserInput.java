import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Ask the username
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name : ");
        String username = sc.nextLine();
        System.out.println("How old are : ");
        int age = sc.nextInt();
        System.out.println("So your name is " + username + " and you are " + age + "years old");
    }
}
