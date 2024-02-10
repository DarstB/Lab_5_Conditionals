import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        int birthMonth;
        String trash;

        do {
            System.out.print("Enter your birth month (1-12): ");

            if(in.hasNextInt()) {
                birthMonth = in.nextInt();
                done = true;
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                trash = in.nextLine();
                System.out.println("The input " + trash + " is invalid. Try again!");
            }

        } while(!done);
    }
}