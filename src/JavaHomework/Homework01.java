package JavaHomework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your high in inches");
        int height= scan.nextShort();

        if (height<=60){
            System.out.println("You're a short person");
        } else if (height>60&&height<=72) {
            System.out.println("You're kind of high");
        } else if (height>72) {
            System.out.println("You're a tall person");
        }

    }
}
