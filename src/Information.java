import java.util.Arrays;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n = sc.nextInt();
        //creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
        //reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }
        int[] ints={1,14,73,5,17,91,88};
        int sum= ints[1]+ints[5];
        ints[1]=ints[5];
        ints[5]=sum-ints[1];
        System.out.println(Arrays.toString(ints));

        System.out.println("--------");

        int[] Fib = new int[10];
        System.out.println("the first 10 numbers of Fibonacci series are :");
        Fib[0] = 0;
        Fib[1] = 1;
        System.out.println(Fib[0]+" ");
        System.out.println(Fib[1]+" ");
        for (int i = 2; i < 10; i++) {
            Fib[i] = Fib[i - 1] + Fib[i-2];
            System.out.println(Fib[i]+" ");

        }
    }

}
