package Class16;

public class Task4 {
    /*
    Create a method that will say Hello in different language based
    on the country that will be passed when method is executed
    return type = String void
    name = saHello
    parameter = String countryName
     */

    String sayHello(String countryName){
        switch (countryName){
            case "USA":
                return "Hello";//return is doing the same job of break, so break is not needed.
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("China"));
    }
}
