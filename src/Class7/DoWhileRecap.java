package Class7;

import java.util.Scanner;

public class DoWhileRecap {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number;//it's import to create the variable outside the brackets
        do{
            System.out.println("Please enter a number");
            number=scan.nextInt();
        }while (number!=5);

        int number2=2;

        while (number2!=5){
            System.out.println("Please enter a number");
        }

    }
}
