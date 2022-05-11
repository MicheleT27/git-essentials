public class BankAccountTest extends BankAccount {

        public static void main(String[] args) {

            BankAccount myAccount = new BankAccount(800.5);
            BankAccount otherAccount = new BankAccount(250.3);

            System.out.println("myAccount balance: " + myAccount.getBalance());
            System.out.println("otherAccount balance: " + otherAccount.getBalance());

            double amount = 90.5;
            System.out.println("Depositing money to myAccount, amount = "+ amount);
            myAccount.deposit(amount);

            System.out.println("myAccount balance: " + myAccount.getBalance());

            System.out.println("Trying to deposit 7055.95 to myAccount");
            myAccount.deposit(7055.95);

            System.out.println("myAccount balance: " + myAccount.getBalance());

            System.out.println("Want to withdraw " + amount);
            myAccount.withdraw(amount);

            System.out.println("myAccount balance: " + myAccount.getBalance());

            System.out.println("Trying to withdraw 1000 Euros");
            myAccount.withdraw(myAccount.getBalance()+100);

            System.out.println("myAccount balance: " + myAccount.getBalance());

            System.out.println("Transferring 100 Euros from myAccount to otherAccount");
            myAccount.transferFunds(otherAccount,amount);

            System.out.println("myAccount balance: " + myAccount.getBalance());
            System.out.println("anotherAccount balance: " + otherAccount.getBalance());

            System.out.println("Trying transfer 350 Euros from otherAccount to myAccount");
            myAccount.transferFunds(otherAccount, otherAccount.getBalance()+500);

            System.out.println("myAccount balance: " + myAccount.getBalance());
            System.out.println("anotherAccount balance: " + otherAccount.getBalance());



        }
}

