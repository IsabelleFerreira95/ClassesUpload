package JavaReview.three;

public class Review3SwitchCase {
    public static void main(String[] args) {

        /*
        World Cup:
        and provide winners
         */
        int worldCup = 2014;

        switch (worldCup) {

            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;
            default:
                System.out.println("Winner is unknown");
        }
    }
}
