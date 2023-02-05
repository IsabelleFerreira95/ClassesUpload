package Class18;

public class Donkey {
    String name;
    int age;
    /*
    Donkey(){
        System.out.println("This is a non argument constructor");
    }
    */
    Donkey(String name, int age){
        this.name =name;//the therm "this" is a key word.
        this.age =age;

    }

    void print (){
        System.out.println(" Donkey's name is "+name+" and age is "+age);
    }
}
