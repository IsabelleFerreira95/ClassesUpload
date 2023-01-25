package Classe13;

public class StringRecap {
    public static void main(String[] args) {
        //How can I print all the letters from this String one by one.
        String str="Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        //What is the input to the charAt() method its int out is char
        //count how many times the letter a has appeared in the above String
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("letter a has appeared "+count+" times");
    }
}
