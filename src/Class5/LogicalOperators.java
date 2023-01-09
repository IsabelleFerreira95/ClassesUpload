package Class5;

public class LogicalOperators {
    public static void main(String[] args) {
        /* Logical operators is just another set of symbols that we use to combine multiple boolean values.
        There are 3 logical operators:
        !-->Not operator (!)-->Not is used to negate the boolean values
        ||
        &&
         */

        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);
        int number=9;
        if (number!=1)
        {
            System.out.println("Hello World");
        }else{
            System.out.println("Hello Java");
        }

        String country="China";

        if (!country.equals("BadCountry")){
            System.out.println("You are welcome");
        }
        if (country.equals("Nepal")){
            System.out.println("You are welcome");
        }
        if (10>5||4>6){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        String name="Adam";
        int age=31;
        if (name.equals("Adam")&& age==30){
            System.out.println("You are Adam from batch 13");
        }else {
            System.out.println("I don't know you");
        }

        boolean isTrue=false;
        if (!isTrue){
            System.out.println("You got it");
        }else {
            System.out.println("Need more practice");
        }
        boolean cond=false;
        boolean condition=!cond;
        System.out.println(condition);
        if (condition){
            System.out.println("you got it");
        }else{
            System.out.println("need more practice");
        }

    }

}
