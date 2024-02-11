import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOne = 0;
        int numTwo = 0;
        boolean done = false;
        String trash;

        do {
            System.out.print("Enter your first value: ");

            if(in.hasNextInt()) {
                numOne = in.nextInt();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input " + trash + " is invalid. Try again!");
            }
        } while(!done);

        done = false;

        do {
            System.out.print("Enter your second value: ");

            if(in.hasNextInt()) {
                numTwo = in.nextInt();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input " + trash + " is invalid. Try again!");
            }
        } while(!done);

        if(numOne == numTwo) {
            System.out.println("The values are equal.");
        }
        else if(numOne >= numTwo) {
            System.out.println("The first value is greater than the second value.");
        }
        else {
            System.out.println("The second value is greater than the first value.");
        }
    }
}