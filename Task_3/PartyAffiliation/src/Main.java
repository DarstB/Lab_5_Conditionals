import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String partyAffiliation;

        System.out.println("Enter a 'D' for Democrat.");
        System.out.println("Enter a 'R' for Republican.");
        System.out.println("Enter a 'I' for Independent.");
        System.out.println("If these don't apply to you, enter 'Other'.");
        System.out.print("Enter your party affiliation: ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Man.");
        } else {
            System.out.println("You are Other.");
        }
    }
}