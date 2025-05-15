// Custom Exception: LowBalanceException
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception: NegativeNumberException
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Display current balance
    public void balanceEnquiry() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Deposit amount
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount!");
        }
        balance += amount;
        System.out.println("Successfully deposited ₹" + amount);
    }

    // Withdraw amount
    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount);
    }
}

// Main class to demonstrate
public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // starting with ₹5000

        account.balanceEnquiry();

        try {
            account.deposit(2000);
            account.balanceEnquiry();

            account.withdraw(1000);
            account.balanceEnquiry();

            account.withdraw(7000); // This should throw LowBalanceException
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account.deposit(-500); // This should throw NegativeNumberException
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
