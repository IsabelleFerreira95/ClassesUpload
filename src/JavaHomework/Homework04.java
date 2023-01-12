package JavaHomework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");

        String birthMonth= scan.next();

        if (birthMonth.equalsIgnoreCase("December")
                ||birthMonth.equalsIgnoreCase("January")
                ||birthMonth.equalsIgnoreCase("February")){
            System.out.println("You were born on Winter");
        } else if (birthMonth.equalsIgnoreCase("March")
                || birthMonth.equalsIgnoreCase("April")
                || birthMonth.equalsIgnoreCase("May")) {
            System.out.println("You were born on Spring");
        } else if (birthMonth.equalsIgnoreCase("June")
                || birthMonth.equalsIgnoreCase("July")
                || birthMonth.equalsIgnoreCase("August")) {
            System.out.println("You were born on Summer");
        }
        if (birthMonth.equalsIgnoreCase("September")
                || birthMonth.equalsIgnoreCase("October")
                ||birthMonth.equalsIgnoreCase("November")) {
            System.out.println("You were born on Fall");

        }

    }
}
