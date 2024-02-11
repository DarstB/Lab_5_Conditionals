import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = in.nextInt();

        if(age >= 21) {
            System.out.println("You get a wrist band!");
        }
        else {
            System.out.println("You are under 21. No wrist band for you!");
        }
    }
}