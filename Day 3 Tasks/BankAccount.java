

public class BankAccount {

    private double balance;


    public BankAccount() {}
        //Empty Constructor

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deposit(double depositAmount) {
        if(depositAmount > 5000) {
            System.out.println("Transaction cancelled. Max deposit is 5000. Your deposit " + depositAmount);
            return;
        }

        double newBalance = balance + depositAmount;
        balance = newBalance;
        System.out.println("Successfully deposited " + depositAmount);
    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > balance) {
            System.out.println("Not enough funds");
            return;
        }

        double newBalance = balance - withdrawAmount;
        balance = newBalance;
        System.out.println("Successfully withdrew " + withdrawAmount);
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void transferFunds(BankAccount destination, double transferAmount) {
        if(transferAmount > balance) {
            System.out.println("Transfer cancelled. Not enough funds");
            return;
        }
        destination.balance = destination.balance + transferAmount;
        this.balance = this.balance - transferAmount;
    }

    public double getBalance() {
        return balance;
    }
}

