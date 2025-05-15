public class useOfStatic{
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Aniket", 1000.0);
        BankAccount acc2 = new BankAccount("Parvej", 2000.0);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();


        System.out.println("Updated accounts...");
        BankAccount.setInterestRate(6.5);
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}

class BankAccount {
    // Static variable
    private static double interestRate;

    // Static block
    static {
        interestRate = 5.0;
    }

    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Static method
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    // Static method
    public static double getInterestRate() {
        return interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();

    }
}