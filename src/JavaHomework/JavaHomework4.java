package JavaHomework;

import java.util.Scanner;

public class JavaHomework4 {
    public static void main(String[] args) {

       /* Write a program to ask a user to enter item they want to buy and the price of that item.
       Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"/*
        */
        /*double change=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("What product you are buying");
        String product= scan.next();
        System.out.println("How much does this product cost?");
        double price= scan.nextDouble();
        System.out.println("Enter the amount you are paying?");
        double payment= scan.nextDouble();

        for (double i = payment; i >price ; i++) {
            if (i>price){
                change=payment-price;
            }

        }
        System.out.println("Here is your change"+change);
        System.out.println("Thank you for shopping");*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an item you would like to purchase: ");
        String Item=input.nextLine();
        System.out.println("Please enter the price of this item:");
        double price= input.nextDouble();
        System.out.println("Your Total is "+price);

        while (price>0){
            System.out.println("Please enter the amount you would like to pay? ");
            double EnteredAmount= input.nextDouble();
            price-=EnteredAmount;

            if(price>0){
                System.out.println("Amount Due: "+price);
                break;
            }else {
                System.out.println("Your change is: " +price);
                System.out.println("Thank you for your shopping");
            }
        }

    }
}
