package Class9;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //Write a program that can tell us how many times the number 10.5 is present in the array
        double[] arr={10.5,12.0,45,10.5,23,10.5};
        System.out.println(arr.length);// it prints how many numbers are stored
        System.out.println("*******");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==10.5){
                count++;
                System.out.println(i);//it shows in which index the number 10.5 is
            }
        }
        System.out.println("********");
        System.out.println(count);
    }
}
