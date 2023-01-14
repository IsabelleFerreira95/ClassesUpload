package Class8;

public class BreakKeywordDemo {
    public static void main(String[] args) {
        //This time of code, break, works only with "Switch" and any type of loop

        for (int i = 0; i < 10; i++) {

            if (i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("Last line in our code");
    }
}
