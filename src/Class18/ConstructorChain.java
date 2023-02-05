package Class18;

public class ConstructorChain {

    /*
    you can have multiple constructors with the same name since you change the parameter
     */

    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }
    ConstructorChain(String str){
        this();//making a call to non argument constructor
               //this()-> ALWAYS must be on the first line
        System.out.println(str);
    }
    ConstructorChain(String str,int number){//you can only call the constructor that exist,
        // you can call inside its own constructor
        this(str);
        System.out.println("This is constructor with int parameter");
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain("Hello", 20);
        System.out.println("----End of teh code---");
    }
}
