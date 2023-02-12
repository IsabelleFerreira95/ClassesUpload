package Class22;

public class Student {
    public void study(){
        System.out.println("Studying...");
    }
    void  doHomeWork(){
        System.out.println("Solving homeworks");
    }
    void practice(){
        System.out.println("practicing the skills");
    }
}
class  SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programing");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax Students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must practice Replits");
    }
}
class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College student must practice to get good grades");
    }
}
class SchoolStudent extends Student{

}