package week14.DatabaseBank;

public class BankTester {
    public static void main(String[] args) throws Exception{
   //     CreateSimpleBankDB.printDB();
          BankAccountDB roseAccount = new BankAccountDB("Rose Bush");
        System.out.println(roseAccount);
        BankAccountDB joeAccount = new BankAccountDB(10);
        joeAccount.deposit(100.100);
        System.out.println(joeAccount);
        System.out.println("Joe's balance is " + joeAccount.getBalance());
    }
}
