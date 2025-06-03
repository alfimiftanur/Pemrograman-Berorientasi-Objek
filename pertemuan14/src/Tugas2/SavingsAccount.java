package Tugas2;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

//     ERROR: Jika diaktidkan, akan error karena mencoba override final method di kelas BankAccount
//     public void displayAccountInfo() {
//         System.out.println("...");
//     }

//    Solusi: buat method baru/method tambahan
    public void displayAdditionalInfo() {
        System.out.println("This is a savings account.");
    }
}

