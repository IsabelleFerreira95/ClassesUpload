package Class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str="GJGKHBKkuidhkds515844andsanKBJV45487$&%*)*()";
        System.out.println(str.replaceAll("[A-Z]","#"));//replace upper case
        System.out.println(str.replaceAll("[a-z]","#"));//replace lower case
        System.out.println(str.replaceAll("[0-9]","#"));//replace numbers
        System.out.println(str.replaceAll("[A-Za-z]","#"));//replace lower and upper case
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));//replace upper and lower case and numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));//do not replace (^)-->sign for negative
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//deletes whatever is out of the pattern
    }
}
