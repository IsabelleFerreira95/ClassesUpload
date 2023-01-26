package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] array2={10,20,10,10,30};
        addArrayElementsMachine(array2);
        int [] array3={20,20,40,40};
        addArrayElementsMachine(array3);

    }

    static void addArrayElementsMachine(int[] arr){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
