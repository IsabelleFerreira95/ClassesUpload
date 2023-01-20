package Class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
        /*-create an array and store 10, 20, 30, 4, 5, 6, 7, 80
        -create an array the element which are multiple of 2
         */
        int total=0;
        int [] arr={10,20,30,4,5,6,7,80};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                total=total+arr[i];
            }
        }
        System.out.println(total);

    }
}
