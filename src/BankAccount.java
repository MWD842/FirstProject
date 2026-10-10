public class BankAccount {
    String owner;
    String accountNumber;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance>=amount){
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transferTo(BankAccount other, double amount) {
        if (balance>=amount){
            balance = balance - amount;
            other.deposit(amount);
        } else {
            System.out.println("Transfer failed");
        }
    }

    void printInfo() {
        System.out.println(owner+" account "+accountNumber+" balance: "+balance+" OMR");
    }
}
