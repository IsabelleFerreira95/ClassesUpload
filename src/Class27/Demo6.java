package Class27;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));
        System.out.println(booleans.size());
        System.out.println("------");

        //create a normal for loop to print all the elements from this arrayList

        for (Boolean b:booleans){
            System.out.println(b);
        }
        System.out.println("------");

        for (int i = 0; i < booleans.size(); i++) {
            System.out.println(booleans.get(i));
        }
        System.out.println("-----");
        int i=0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}