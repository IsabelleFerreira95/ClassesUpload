package Class15;

public class Dog {
    //variables that are created outside the method but inside a class are called instance variables
    //You can access anytime on your class inside other methods but occupies memory
    String name;//instance variables
    String breed;//instance variables
    String color;//instance variables


    //variables which are outside of methods and have the static keyword are called static variable
    static int noOfLegs=4; //static variable

    //variable created inside a block of code is called local variables
    void printFood(){
        String food="Meat";//local variable
        //local variables are only created while you needed, and it is removed by java
        // as soon as you are done using it.
        //Occupies the memory only for a short period of time
        System.out.println(food);
    }
}
