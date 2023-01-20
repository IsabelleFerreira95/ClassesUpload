package JavaHomework;

import java.util.Scanner;

public class JavaHomework3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter integers other then Zero: ");
        int num1 = keyboard.nextInt();
        System.out.println("enter a second number");
        int num2 = keyboard.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("even numbers= " + even);
        System.out.println("odd numbers= " + odd);

        System.out.println("***************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Start " + start + " end " + end);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                evenSum+=i;//can als be written like evenSum+=i
            } else {
                oddSum=oddSum+i;//can also be written like oddSum+=i
            }
        }
        System.out.println("Sum of all the Even numbers"+evenSum);
        System.out.println("sum of all the odd numbers"+oddSum);
    }

}
