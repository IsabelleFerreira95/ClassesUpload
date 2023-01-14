package Class8;

public class NestedLoops3 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) { // outer for loop

            for (int j = 0; j < 7; j++) { // inner for loop

                if (j==1||j==2){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
