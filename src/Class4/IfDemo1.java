package Class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Let's buy a Samsung phone");
        }
        if (money > 2000) {
            System.out.println("let's also buy a Dell computer");
        }
        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy mother's day");
        }
        //equals method is only for non-primitives
        String name = "Isabelle";
        if (name == "Isabelle") {
            System.out.println("I love going out");
        }
        String work = "google";
        if (work.equals("google")) {
            System.out.println("I work on Google");
        }

    }
}
