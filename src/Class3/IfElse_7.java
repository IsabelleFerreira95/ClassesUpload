package Class3;

public class IfElse_7 {
    public static void main(String[] args) {
        int money=150;
        System.out.println(money>=300);
        if(money>=300)
        {
            System.out.println("yayy let's go for shopping");
        }
          if (money<300){
              System.out.println("let's save money");
              System.out.println("maybe I am spending too much");
          }

          int age=17;
        System.out.println(age<18);

          if(age<18){
              System.out.println("It's time to play");
          }
          boolean inSyntaxBootCamp=true;
          if(true){//whenever the value is true, java will execute the code, but if it's false, it won't execute.
              System.out.println("time to start practicing java");
          }
          char c='M';
          if (c=='M'){
              System.out.println("Male");

          }

          String name="Isabelle";
          //with non-primitive data types such as String, we can't use == symbol
          if (name.equals("Isabelle")){
              System.out.println(name+" It is an amazing student");
          }
          boolean hungry=false;
        System.out.println(hungry);
        //! symbol can change true to false and vice versa.
          if(!hungry){
              System.out.println("Let's eat");
          }
          int money1=150;
          if(money1>300) {
              System.out.println("let's go for shopping");
          }else {
              System.out.println("let's save some money");
          }
    }
}
