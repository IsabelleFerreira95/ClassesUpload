package Class17;

public class Student {

    /*
    Create a class call it student, define 4 instance fields like id, name, age, weight
    Create 5 objects of this class. Do this task without constructors and with constructions
     */

    String name;
    String field;
    String id;
    int age;
    double weight;

    Student(String studentName, String studentField, String studentId, int studentAge, double studentWeight){
        name=studentName;
        field=studentField;
        id=studentId;
        age=studentAge;
        weight =studentWeight;
    }
    void printInfo(){
        System.out.println("Name:"+name+" Field:"+field+" ID:"+id+" Age:"+age+"Weight"+weight);
    }

    public static void main(String[] args) {

        Student student1=new Student("Isabelle","IT","123",27,165.5);
        student1.printInfo();
        Student student2=new Student("Mateo","IT","456",28,175.5);
        student2.printInfo();
        Student student3=new Student("Jorge","IT","789",33,200.5);
        student3.printInfo();
        Student student4=new Student("David","IT","1231",29,185.5);
        student4.printInfo();
        Student student5=new Student("Marcela","IT","1232",24,145.5);
        student5.printInfo();

         /*
        Student student=new Student();
        student.name="Isabelle";
        student.field="IT";
        student.id="123";
        student.age=27;
        student.weight=165.5;

        Student student1=new Student();
        student1.name="Mateo";
        student1.field="IT";
        student1.id="456";
        student1.age=28;
        student1.weight=175.5;

        Student student2=new Student();
        student2.name="Jorge";
        student2.field="IT";
        student2.id="789";
        student2.age=33;
        student2.weight=200.5;

        Student student3=new Student();
        student3.name="David";
        student3.field="IT";
        student3.id="1231";
        student3.age=29;
        student3.weight=185.5;

        Student student4=new Student();
        student4.name="Marcela";
        student4.field="IT";
        student4.id="1232";
        student4.age=24;
        student4.weight=145.5;
        */
    }
}
