package Tugas2;

public class BankAccount {
    private final String accountNumber; // final -> tidak bisa diubah setelah diinisialisasi
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber; // harus diinisialisasi
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // final method tidak bisa dioverride di subclass
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rp" + balance);
    }
}
