package Class15;

public class MethodPracticeTester {
    //create a method which returns true or false and take
    // the int numbers as a parameter if number is
    //even it returns true otherwise it returns false
    public static void main(String[] args) {
        Create creates=new Create();
        boolean isEven= creates.isEven(12);
        System.out.println(isEven);

        boolean isEven1= creates.isEven(100);
        System.out.println(isEven1);

        boolean isEven2= creates.isEven(20);
        System.out.println(isEven2);

        System.out.println(creates.isEven(30));

    }

}
