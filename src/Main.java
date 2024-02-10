import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double SHIPPING_FEE = 0.02;
        double productPrice;
        double totalCost;

        System.out.print("Enter the price of your item: ");
        productPrice = in.nextDouble();

        if(productPrice >= 100) {
            System.out.println("Your shipping is free!");
            totalCost = productPrice;
            System.out.println("Your total cost is $" + totalCost);
        }
        else {
            totalCost = productPrice + (SHIPPING_FEE * productPrice);
            System.out.println("Your total cost is $" + totalCost);
        }
    }
}