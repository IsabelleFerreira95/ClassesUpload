package Class16;

public class Task3 {
    /*
    Create a method that will print whether String is palindrome or not

    return type = void
    name = isPalindrome
    parameters = String input
    {
    }
    Example dad = da true
    abc = cba false
     */

    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+"palindrome");
        }else {
            System.out.println(str+"isn't a palindrome");
        }

    }

    public static void main(String[] args) {

       Task3 task3=new Task3();
       //String result=task3.isPalindrome("Kaya"); Can't assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya")); Can't use void methods in Println that doesn't return.
       task3.isPalindrome("Kaya");//if the method has a return, it is necessary to put and input.
        System.out.println(45);

    }
}
