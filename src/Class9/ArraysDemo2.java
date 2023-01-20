package Class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //10 20 30 45 50

        int [] numbers={10,20,30,45,50};
        int total=0;//to get a total of an equation, it's necessary to have a value for the total

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
            total=total+numbers[i];//adding all the numbers
        }
        System.out.println(total);
    }
}
