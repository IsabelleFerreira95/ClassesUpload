package JavaReview;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };
        int numberOfArrays = array.length;
        System.out.println(numberOfArrays);
        int numberOfElementsIn1Array = array[0].length;
        System.out.println(numberOfElementsIn1Array);
        int numberOfElementsIn4Array = array[3].length;
        System.out.println(numberOfElementsIn4Array);

        //getting all values from 2D array
        for (int[] arr : array) {//iterates over arrays
            for (int num : arr) {//iterates over each element
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
        //getting all values from 2D array using regular for loop
        for (int row = 0; row < array.length; row++) { //outer loop iterates over rows
            for (int colum = 0; colum < array[row].length; colum++) {//iterates over each column
                if (row % 2 != 0) {
                    System.out.println(array[row][colum] + " ");
                }
            }
        }

    }
}
