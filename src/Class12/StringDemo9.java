package Class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="Isabelle 349857 ~?*&^@#%";
        int counter=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){// you can use isAlphabetic to check only letters
                //isDigit is to check only numbers
                counter++;
            }
        }
        System.out.println("Total of Str is "+counter);
    }
}
