package Class8;

public class BreakKeyDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (summer){
            if (temp<=100){
                System.out.println("I love summer because temperature is "+temp);
            }else {
                System.out.println("It's very hot" +temp);
                break;
            }
            temp+=5;

        }

    }
}
