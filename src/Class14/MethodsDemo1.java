package Class14;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int [] array1={10,20,30,45,50};
        int sume=0;
        for (int number:array1){
            sume+=number;
        }
        System.out.println(sume);
        //System.out.println(Arrays.toString(array1))
        int [] array2={10,10,10,20,30};
        int sum2=0;
        for (int number:array2){
            sum2+=number;
        }
        System.out.println(sum2);

        int [] array3={10,10,10,20,30};
        int sum3=0;
        for (int number:array3){
            sum3+=number;
        }
        System.out.println(sum3);
    }
}
