package Class2;

public class DecimalNumbers {
    public static void main(String[] args) {
        /*if we want to store numbers (10.5, 110.2, etc.) in computer's memory using java we can use
        following types:
        float
        decimal
         */
        float myNumberBox=10.5f;
        float mySecondBox=5.5f;
        System.out.println(myNumberBox);
        double largeDecimalBox=136478.12333;//for large decimals use commend double.
        System.out.println(largeDecimalBox);

        //ways to store a letter
        char letter='I';//char is to store only one letter

        String name="Isabelle";
        /* string data type belongs to a different category called non-primitives. That's why for
        string rules are a little different. For example, S of string is upper case, it's color
        is also not blue. Inside string, you can put spaces between the words.
         */
        System.out.println(name);

        //for variable of true and false we use:
        boolean hungry=true;//true means yes
        boolean tired=false;//false means no

    }
}
