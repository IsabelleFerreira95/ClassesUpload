package JavaHomework;

public class Homework05 {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;
        while (day<8){
            if (day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I don't need a day off anymore");
                workDay=false;
            }
            day++;//it is equal to day=da+1 day+=1

            /*
            boolean workDay=true;
            int day=1;
            while(day<6){
                System.out.println(" I need a day off");
                day++;

            }System.out.println("I dont need day off anymore");
            *********************************************************************************
            int day=1;
        boolean workDay=true;

        while (day<7){
            System.out.println("I need a day off");
            day++;
        }
            workDay=false;
            System.out.println("I don't need a day off anymore");
        }*/
        }
    }
}
