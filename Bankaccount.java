// create bank account in java program.
// uploading in git.(as a project)
public class main{
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        account.deposit(500);
        account.withdrawl(1501);
        account.grtBalance();
    }
    }

class bankAccount{
   private double balance = 1000 ;

    void deposit(double deposit){
      balance = deposit + balance ;
     System.out.println("avilable balance : " + balance);
    }
    
    void withdrawl(double withdrawl){
        balance = balance - withdrawl ;
        System.out.println("avilable balance : " + balance);
    }

    void grtBalance (){
        System.out.println("avilable balance : " + balance);
    }
    
}
 
