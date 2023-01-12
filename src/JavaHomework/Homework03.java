package JavaHomework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int quizGrade= scan.nextInt();

        if (quizGrade>=90){
            System.out.println("Grade A");
        } else if (quizGrade>=70&&quizGrade<90) {
            System.out.println("Grade B");
        } else if (quizGrade>=50&&quizGrade<70) {
            System.out.println("Grade C");
        } else if (quizGrade<50) {
            System.out.println("Grade F");
        }









        /*if (mathScore>90&&historyScore>90&&ScienceScore>90){
                System.out.println("you are a brilliant student");
            }else {
                System.out.println("You need to work harder");
            }*/

        }

    }

