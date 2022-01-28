package week3;

public class BankAccount {

    // Attributes
    private String owner;
    private double balance;
    private int account;

    // constructor
    public BankAccount(String name, int account) {
        owner = name;
        balance = 0;
        this.account = account;
    }

    //other methods
    public void deposit(double amount)  {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
    //Print method

    public String toString() {
        return owner + " has account " + account +  " with balance " + balance;
    }

    public static void main(String[] args) {
        BankAccount suzyAcct = new BankAccount("Suzy", 1234);
        System.out.println(suzyAcct);
        suzyAcct.deposit(200.00);
        System.out.println(suzyAcct);
        suzyAcct.withdraw(100.00);
        System.out.println(suzyAcct);
    }
}
