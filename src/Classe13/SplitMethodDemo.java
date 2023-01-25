package Classe13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like Java. I write a lot of code daily. I am from batch 15";
        String [] strArr=str.split("[.?!]");//to split the sentence, we need to use one of those characters.
        System.out.println(strArr.length);
        System.out.println(strArr[1].trim());//To print the sentence
        //whenever we are working with Arrays we use the length
        // and whenever we are working with Strings, we use length()
    }
}
