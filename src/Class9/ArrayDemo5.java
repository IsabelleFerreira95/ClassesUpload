package Class9;

public class ArrayDemo5 {
    public static void main(String[] args) {
        /*
        -Create an empty array then store 45, 44, 33,20 and 10 in it then use a loop
        -to add all the elements which are present in even indexes and print it after adding them

         */

        int total=0;
        int [] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        //numbers[5]=50; error out of bounds
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0){
                total=total+numbers[i];
            }
        }
        System.out.println(total);
    }
}
