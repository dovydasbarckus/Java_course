import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("What is your name?");
         String name = scanner.nextLine();
         System.out.println("How old are you?");
         int age = scanner.nextInt();
         scanner.nextLine();
         System.out.println("WHat is your favorite food?");
         String food = scanner.nextLine();

         System.out.println("Hello " + name + "\nYou are " + age + " years old");
         System.out.println("Your favorite food is " + food);
    }
}
