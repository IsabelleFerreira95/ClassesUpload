package Class27;

import java.util.ArrayList;

public class Demo8 {

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //Add method to add elements to this arrayList
        names.add("Isabelle");
        names.add("Jorge");
        names.add("David");
        names.add("Steve");
        names.add("Amanda");

        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
