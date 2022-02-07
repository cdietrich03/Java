package week3;

public class BankAccount {

    private static int nextId = 100;

    // Attributes
    private static int numberOfAccounts = 0;
    private String owner;
    private double balance;
    private int account;

    // constructor
    public BankAccount(String owner, int account) {
//        this.owner = owner;
//        balance = 0;
//        this.account = nextId;
//        nextId++;
//        numberOfAccounts ++;
        this(owner, nextId++, 0);
    }

    public BankAccount(String owner, int account, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.account = account;
        numberOfAccounts++;
    }

    //other methods

    public static int getNumberOfAccounts() {
       return numberOfAccounts;
    }

    public void deposit(double amount)  {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
//            this.sayHi();
            sayHi();
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    public String sayHi() {
        int x = 10;
        return ("Hi" + x);
    }
    //Print method

    public String toString() {
        return owner + " has account " + account +  " with balance " + balance;
    }

//    public static void main(String[] args) {
//        BankAccount suzyAcct = new BankAccount("Suzy", 1234);
//        System.out.println(suzyAcct);
//        suzyAcct.deposit(200.00);
//        System.out.println(suzyAcct);
//        suzyAcct.withdraw(100.00);
//        System.out.println(suzyAcct);
//    }
}
