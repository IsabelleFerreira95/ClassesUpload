package Class16;

import java.util.Scanner;

public class Person {

    private double bankBalance;
    String Address="Street 123";//default access level is applied
    String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("Password");

    }
    void printSSN(){
        System.out.println("12093438");
    }

    public void printAccount(){
        System.out.println("User 123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        //if a variable is private, it will be exclusive to the class the variable is in.


        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}
