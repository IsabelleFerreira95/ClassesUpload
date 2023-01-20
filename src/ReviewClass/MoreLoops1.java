package ReviewClass;

public class MoreLoops1 {
    public static void main(String[] args) {
        System.out.println("---Break Condition---");
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.println("Hello");
                break;//it breaks the loop/it exits the loop
                //when the breaks happen, it breaks the inner loop, so it goes to the outer loop
            }
            System.out.println("Bye");
            break;
        }
        System.out.println("---Continue Condition-----");
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <-4 ; j++) {
                if (j<2){
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");
        }
    }
}
