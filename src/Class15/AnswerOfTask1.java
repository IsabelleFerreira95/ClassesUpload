package Class15;

public class AnswerOfTask1 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String firstName,String lastNAme, String emailType){
        return firstName+lastNAme+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        AnswerOfTask1 fullEmail=new AnswerOfTask1();
        System.out.println(fullEmail.createEmail("Isabelle","Ferreira","gmail"));
    }
}
