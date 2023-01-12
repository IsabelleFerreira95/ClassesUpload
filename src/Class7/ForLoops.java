package Class7;

public class ForLoops {
    public static void main(String[] args) {

        int number=0;//creating a variable of type int
        while (number<10){//checks the condition if condition is true execute the code in the body of while loop
            System.out.println(number);//prints the value of the number on the console
            number++;//it adds one to the number variable
        }

        //(initialize; condition; incrementORdecrement)
        for (int i=0;i<10;i++){
            System.out.println(i);



            //using a for loop print odd numbers from 1 to 20;

            /*
            int num=20;
            while (num<=20){
                if (num%2!=0)
                System.out.println(num);
                num++;
            }
            */

            for (int num=1;num<20;num+=2){
                System.out.println(num);
            }


        }
    }
}
