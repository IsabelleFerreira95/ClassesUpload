package Class5;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        int day = 5;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }
        int day1=1;
        switch (day1){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");

                //We can only use byte, short, int, char, string.
        /*boolean rich=true;
        switch (rich){

         */

                // We can't use relational operators in switch case statement
       /* int number=10;

        switch (number){
            case number>5 || number<10,

        */
        } Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender  m f");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
