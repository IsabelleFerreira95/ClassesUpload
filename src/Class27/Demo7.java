package Class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Isa");
        names.add("Savo");
        names.add("Fizzy");
        names.add("Zozi");
        names.add("Joe");
        names.add("Fefo");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Fizzy");
        System.out.println(names);
        names.set(3, "Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));

    }
}
