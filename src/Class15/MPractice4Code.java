package Class15;

public class MPractice4Code {
    int intNumber(int number) {
        int[] num = {10, 20, 30};
        int smallest = num[0];
        int highest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > smallest) {
                highest = num[i];
            } else if (num[i] < smallest) {
                smallest = num[i];
            }
            return highest;
        }
        return smallest;

    }
    int largerNumber(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    
}
