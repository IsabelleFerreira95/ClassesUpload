package Class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More Java";
        /*
        create smaller strings from the bigger one.
        As strings are immutable in Java, the original string remains as it is,
        and the method returns a new string.
        */
        String newStr=str.substring(28);
        System.out.println(newStr);
        //we can also specify the starting point and the ending point.
        System.out.println(str.substring(0,27));
    }
}
