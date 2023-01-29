package Class16;

public class StudentTester {
    public static void main(String[] args) {
        StudentCode studentCode=new StudentCode();
        studentCode.name="Isabelle";
        studentCode.id="123";
        studentCode.schoolName="Syntax";
        studentCode.age=27;
        studentCode.weight=70;

        StudentCode studentCode1=new StudentCode();
        studentCode1.name="David";
        studentCode1.id="456";
        //studentCode1.schoolName="Syntax";
        studentCode1.age=29;
        studentCode1.weight=86;

        StudentCode studentCode2=new StudentCode();
        studentCode2.name="Nelson";
        studentCode2.id="789";
        studentCode2.age=26;
        studentCode2.weight=90;
        //studentCode2.schoolName="Syntax";

        System.out.println(studentCode2.schoolName);
        System.out.println(StudentCode.schoolName);//

    }
}
