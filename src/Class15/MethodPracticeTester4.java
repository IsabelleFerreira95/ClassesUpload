package Class15;

public class MethodPracticeTester4 {
    public static void main(String[] args) {
        /*
        create the object of the class that has the method
        objectname.methodname
         */
        MPractice3 mp=new MPractice3();
        int[] array={10,20,30};
        System.out.println(mp.arraySum(array));

        System.out.println(mp.arraySum(new int[]{10,10,10}));

    }
}


