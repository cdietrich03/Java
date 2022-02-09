package week5;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        BankAccount acct4 = suzyAccount;
        BankAccount acct5 = suzyAccount.copy();
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        System.out.println(suzyAccount);
        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        System.out.println(suzyAccount);
        System.out.println(acct5);
    }
}
