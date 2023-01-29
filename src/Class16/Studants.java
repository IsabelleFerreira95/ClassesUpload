package Class16;

public class Studants {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String studentName;
    String studentID;
    static int numberOfStudents;


    public static void main(String[] args) {
        Studants isabelle=new Studants();
        isabelle.studentName="Isabelle";
        isabelle.studentID="1";
        isabelle.numberOfStudents++;
    }
}
