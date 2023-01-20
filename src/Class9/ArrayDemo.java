package Class9;

public class ArrayDemo {
    public static void main(String[] args) {
        String name1="Slava";
        String name2="Safi";
        String name3="Nabi";
        String name4="Jason";
        String name5="Anees";

        String[] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};

        System.out.println(name2);
        System.out.println(names[4]);
        //System.out.println(names[500]); error bc there's no index number 500
        //System.out.println(names[-5]); error bc index can't be negative

        for (int i = 0; i <=6 ; i++) {
            System.out.println(names[i]);
        }

    }
}
