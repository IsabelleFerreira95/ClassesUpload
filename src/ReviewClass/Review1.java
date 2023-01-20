package ReviewClass;

import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need a loan");
        boolean needLoan=scan.nextBoolean();
        if (needLoan){
            System.out.println("what is your score?");
        } else {
            System.out.println("Unknown");
        }
        int score=scan.nextInt();
        if (score<=600){
            System.out.println("You're not eligible");
        } else if (score>700) {
            System.out.println("Maybe you're eligible");
        } else if (score>701) {
            System.out.println("Eligible");
        } else if (score>800) {
            System.out.println("Definitely eligible");
        }
    }

    }






