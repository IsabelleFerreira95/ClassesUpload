package Class19_1;

import Class19.JavaTeacher;
public class University {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.homework(); //public
        //jt.grade(); // protected not visible in different package
        //jt.scholarship(); //default not visible in different package
        //jt.extraPoint(); // private not visible
    }

}
