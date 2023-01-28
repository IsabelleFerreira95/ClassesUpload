package Class15;

public class Create {
   /* void returnInt(){
        for (int i = 0; i < 10; i++) {
            if (i%2==0);
            return;
        }*/
    boolean isEven(int number){
        boolean flag;
        if (number%2==0){
            flag=true;
        }else {
            flag=false;
        }
        return flag;
    } boolean isEven1(int number){
        boolean flag;
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    } boolean isEven2(int number){
        return number%2==0;
    }
}

