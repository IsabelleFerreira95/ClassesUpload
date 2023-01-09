package Class4;

public class IfElseConditions2 {
    public static void main(String[] args) {
        boolean rain = true;
        if (rain) {
            System.out.println("Let's take the umbrella");//plan A
        } else {
            System.out.println("Let's take the hat");//Plan B
            boolean breakTime=true;
            if (breakTime){
                System.out.println("Let's take a break");
            }else{
                System.out.println("Let's continue the class");
            }

        }

    }
}
