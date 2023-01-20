package ReviewClass;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        System.out.println("Do you need a loan");
        boolean needLoan=scann.nextBoolean();
        if (needLoan){
            System.out.println("what is your score?");
        } else {
            System.out.println("Unknown");
        }
            int score = scann.nextInt();
            if (score <= 600) {
                System.out.println("You're not eligible for the loan.");
            } else if (score >= 600&&score<=700) {
                System.out.println("You're maybe eligible for the loan.");
            } else if (score>=701&&score<=800) {
            System.out.println("Eligible.");
            }else {
                System.out.println("Definitely eligible");
            }
        }

    }

