// Example:
// Class: BankAccount
// Attributes: accountNumber, balance (private)
// Methods: setBalance(double balance), getBalance()
class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; 
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Your Balance is now: " + balance);
    }

    public double getBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }
}