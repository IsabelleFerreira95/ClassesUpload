package Class16;

public class StudentCode {

    String name;
    String id;
   static String schoolName;
   /*static variables only occupies
    one memory location even if we create multiple variables with the same name
    Static variables can be accessed in any method of class or with the help
    of any object of any class.
    */
    int age;
    double weight;
    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
        //System.out.println(name); can't access here
        System.out.println(schoolName);
    }
}
