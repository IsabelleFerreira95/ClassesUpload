package JavaHomework;

import java.util.Scanner;

public class JavaHomework2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        for (int question = 0; question <10; question++) {
            System.out.println("Would you like to apply for a credit card?");
            String answer= scan.next();
            if (answer.equalsIgnoreCase("yes")){
                break;
            }
        }



    }

}
