class BankAccount {
    protected double balance;

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of ₹100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);

        myAccount.showBalance();
        myAccount.deposit(200);
        myAccount.withdraw(300);  
        myAccount.showBalance();
        myAccount.withdraw(350);      
        myAccount.showBalance();
    }
}
