package ReviewClass;

import java.util.Scanner;

public class Review2 {
    public static void main(String[] args) {
         int a=1;
         while(a<=3){
             System.out.println("This is a while loop");
             a++;
             // when we do not know how many times we need to repeat a block of code
             //while or do while

             int b=1;
             do{
                 System.out.println("Do while");
                 b++;
             }while (b>=3);
             //Ask students if they understand loops
             //if they don't-->Tell them to practice more on loops
             //if they understand-->you good move to array concept

             Scanner scanner=new Scanner(System.in);
             System.out.println("Do you understand loops in java?");

             String answer=scanner.nextLine();


         }
    }
}
