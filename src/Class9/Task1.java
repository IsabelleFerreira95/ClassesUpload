package Class9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1- Ask the user to enter the items they want to buy
        2- Ask the user to enter the prices of the items
        3- Calculate the total amount of all items
        4- Check if the money paid is equal or more than the total
        5- iIf it’s equal say Thank you for shopping, else calculate how much is the change
         */
        Scanner scann = new Scanner(System.in);
        double total=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("What would you like to buy and What is the price?");
            String itemName = scann.nextLine();
            double itemPrice = scann.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount that you have to pay"+total);
        }
        System.out.println("Please pay for the items");
        double amountPaid= scann.nextDouble();
        if (amountPaid>total){
            double change=amountPaid-total;
            System.out.println("Hey here is your change"+change);
        } else if (amountPaid<total) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");
    }
}
