package Class25;

public interface TrustAble {

    public static final  int age=10;//Constants
    String color="Black";
    int trust ();
    static  void method1(){
        System.out.println("Hello world");
    }
    default void method2(){
    }
    private  void method3(){
    }
}
class Bank implements  TrustAble{

    @Override
    public int trust() {
        return 0;
    }
}
