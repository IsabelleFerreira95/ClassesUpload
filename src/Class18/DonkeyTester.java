package Class18;

public class DonkeyTester {
    public static void main(String[] args) {
        //Donkey donkey=new Donkey();//Default constructor created by the compiler
        // when a programmer does not create one
        Donkey donkey=new Donkey("Pepper",3);//The moment you create a constructor
        // compiler does not give any default constructor

        donkey.print();
    }
}
