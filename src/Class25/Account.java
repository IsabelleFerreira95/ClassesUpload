package Class25;

public class Account {
    double balance;
    String accountNumber;
    String type;
    String getAccountTitle;
    public void setBalance(double balance){
        //initializing the input meaning checking the values before we can assign them.
        if (balance<0){
            System.out.println("Negative balance is not allowed its a current account");
        }else {
            this.balance=this.balance+balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountTitle(){
        return getAccountTitle;
    }
    public Account(double balance, String accountNumber, String type, String getAccountTitle){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.type=type;
        this.getAccountTitle=getAccountTitle;
    }
}
class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(-100,"2830429","Checking","Isabelle" );
        System.out.println(account.getAccountTitle());
        account.setBalance(-82739492);
    }
}