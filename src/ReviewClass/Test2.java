package ReviewClass;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        System.out.println("Do you need a loan");
        boolean needLoan=scann.nextBoolean();
        if (needLoan){
            System.out.println("what is your score?");
        } else {
            System.out.println("Unknown");
        }
        int eligibility = scann.nextInt();
        if (eligibility < 600) {
            System.out.println("The eligibility is Not eligible");
        } else if (eligibility >= 600&&eligibility<=700) {
            System.out.println("The eligibility is Maybe eligible");
        } else if (eligibility>=701&&eligibility<=800) {
            System.out.println("The eligibility is Eligible");
        }else {
            System.out.println("The eligibility is Definitely eligible");
        }
    }
}
