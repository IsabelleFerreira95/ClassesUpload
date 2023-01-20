package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[5];
        /*
        Below code manually store numbers in the array
        number[0]=40;
        number[1]=50;
        number[3]=60;
        number[2]=70;
        number[4]=80;
         */


       /*
       below code take the numbers from user and store them in the array it's good but a lot of code
       numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
        */

        //below code uses a normal for loop to ask use for numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
