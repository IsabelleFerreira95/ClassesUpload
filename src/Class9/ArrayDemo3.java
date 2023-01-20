package Class9;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //Create an array to store the letters A B C D E F

        char [] letters={'A','B','C','D','E','F'};
        letters[0]='z';//that's how you can update the value
        for (int i = 0; i < letters.length ; i++) {
            System.out.println(letters[i]);

        }
    }
}
