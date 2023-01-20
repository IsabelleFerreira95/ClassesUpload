package Class11;

public class Example1 {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},
                        {45,55,66},
                        {30,40,20,10,25}
                //Write a loop to print all the elements from this 2D array
        };
        //matrix.length tells us how many 1D arrays are present in this 2 D array
        for (int i = 0; i < matrix.length; i++) {


            //matrix[i].length the size of each 1D array
            for (int j = 0; j < matrix[i].length; j++) {
               // if (j%3!=0){
                if (matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");//it's print not prinln
                }
                System.out.println();
                // foreach loop to print all the numbers from a 2D array
                for (int[] arr:matrix){
                    for (int number:arr){
                        System.out.print(number+" ");
                    }
                    System.out.println();
                }
            }




        }
    }
}
