package Class2;

public class Operators {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;

        System.out.println(number1*number2);
        //for mathematical equations I need to always use int.
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number2-number1);
        System.out.println(number2/number1);

        double number3=10;
        float number4=20;
        //for operations with numbers like 12.5, 27373.0987, etc. I can use double or float.

        System.out.println(number3/number4);
        /*if you have to store whole numbers always use int
        if you have to store decimal numbers always use double
        is you have to store texts or more characters use string
         */
        String firstName="Isabelle";
        String lastNAme="Ferreira";
        System.out.println(firstName+" "+lastNAme);
        /* To put space between things that you write or if you want to put aditional words to add
        just put " " and write between it and don't forget to put the + sign to combine the texts.
         */
        System.out.println("First name="+firstName);
        System.out.println("Last name="+lastNAme);
        System.out.println("10"+" "+"10");
        System.out.println("10"+"10");

        //ALWAYS remember that Java cods from top to bottom.


        int numberBox=10;//we don't need to define the data-types again and again. Java remembers it.
        numberBox=200;//we are reassigning number 20 to numberBox, so we will overwrite 10 with 20.
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox+20);//we can recycle, reuse numberBox as many times as we need.



    }
}
