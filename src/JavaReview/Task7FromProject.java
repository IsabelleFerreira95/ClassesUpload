package JavaReview;

public class Task7FromProject {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        //condition 1- number>1
        //condition 2- number should be divisible only by itself and 1 only

        int given = 3;
        boolean isPrime = true;
        if (given > 1) {
            for (int i = 2; i < given; i++) {
                if (given % i == 0) {
                    isPrime=false;
                    break;
                }
                }
            }else {
            isPrime = false;
        }
        System.out.println("given number "+given+" is prime?"+isPrime);

    }
}
