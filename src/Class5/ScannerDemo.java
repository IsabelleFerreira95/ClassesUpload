package Class5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        Scanner--> Name of the class
        scan is just a variable like we create primitive variables
        --> assignment operator
        System.in=> tells the computer we want to read the data from keyboard.
         */

        System.out.println("please enter your age");
        int age= scan.nextInt();
        System.out.println("you are "+age+" years old");

        System.out.println("please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("you weight is "+weight+" Kgs");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);//char type of input
        System.out.println("your gender is "+gender);

        System.out.println("Please enter your name");
        String name=scan.next();//When we have to take only word input
        System.out.println("Your name is "+name);

        System.out.println("Please enter your full name ");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);
        scan.close();
        /*
        Scanner class:
        Helps use take input from the keyboard.

         */

    }
}
