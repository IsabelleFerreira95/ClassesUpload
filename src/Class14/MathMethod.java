package Class14;

public class MathMethod {
    //Write a method that takes 2 int numbers add them and show the results on console

    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    //create a method that takes 3 int numbers and multiply them
    //show the results on console

    void mul(int one, int two, int three){
        System.out.println(one*two*three);
    }
    int sub(int num1, int num2){
        return num1-num2;//it can only have one return per method
    }
}
