package Class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {

        //We have created an array list of Strings
        //<> are called diamond operator or angle brackets wwe specify the data type in them
        ArrayList<String> names=new ArrayList<>();
        //Add method to add elements to this arrayList
        names.add("Isabelle");
        names.add("Jorge");
        names.add("David");
        names.add("Steve");
        names.add("Amanda");

        System.out.println(names);
    }
}
