package Tugas2;

public class TestBankAccount{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("23304000");
        sa.deposit(1000);
        sa.displayAccountInfo();
        sa.displayAdditionalInfo();
    }
}
