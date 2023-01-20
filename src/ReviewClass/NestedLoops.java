package ReviewClass;

public class NestedLoops {
    public static void main(String[] args) {
        //nested loop-loop inside another loop
        for (int i = 1; i <= 3; i++) {//outer loop
            System.out.println("------");
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {//inner loop-always will depend on outer loop
                //once inner loop finish its execution, then it goes back to outer loop until de outer loop is false.
                System.out.println(j);
            }
        }
        System.out.println("-------------");
        //outer loop controls number of executions for inner loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            for (int j = 1; j <= 2; j++) {
                System.out.println("Bye");
            }

        }
    }
}
