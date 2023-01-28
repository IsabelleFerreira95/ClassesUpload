package Class15;

public class Task1 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    //below is th crazy and long thing I tried to create.
    String[][][] createEmail(String name, String middleName, String email){
        String [][][] fullEmail={};
        for (int i = name.length(); i < 0; i++) {
            for (int j = middleName.length(); j < 0; j++) {
                for (int k = email.length(); k < 0; k++) {
                }
            }

        }
        return fullEmail;

    }
    //below is an example from another classmate
    String creatEmail1(String s1,String s2, String type){

        return s1+s2+"@"+type+".com";}

}
