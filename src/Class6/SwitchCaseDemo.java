package Class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String country=scan.next();

//        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ //coverts any text that is upper case, to lower case. USA-->usa

            case "usa":
                System.out.println("Fat people");
                break;
            case "Italy":
                System.out.println("Stylish people");
                break;
            case "Brazil":
                System.out.println("Very Kind people");
                break;
            case "French":
                System.out.println("Stinky people");

        }
    }
}
