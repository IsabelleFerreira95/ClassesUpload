package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println("**********");
        for (int i = 0; i%3==0 ; i++) {
            for (int j = 0; j%2==0; j++) {//This code is incorrect for what it needed tobe done
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("**********");
        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <=5; i++) {
            System.out.print(2*i+" ");
        }
        System.out.println();
        for (int i = 0; i <=5 ; i++) {
            System.out.print(3*i+" ");
        }
        System.out.println();
        System.out.println("**********");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=(5)*(i+1) ; j++) { //This code is incorrect for what it needed to be done.
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("************");
        for (int i = 1; i <=3 ; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }


    }
}



