package JavaReview;

public class Task3FromProject {
    public static void main(String[] args) {
        int[][] array={
                {1,2,3},
                {11,12},
                {20,21,22},
                {100,101}
        };
        int sum=0;
        for (int[] num:array){
            for (int nums:num){
               sum+=nums;
            }
        }
        System.out.println("total="+sum);
    }
}
