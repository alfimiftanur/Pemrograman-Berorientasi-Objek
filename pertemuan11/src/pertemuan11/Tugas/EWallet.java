package pertemuan11.Tugas;

public class EWallet extends Pembayaran {
    private double saldo;

    public EWallet(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void prosesPembayaran(){
        if (saldo >= jumlah){
            saldo -= jumlah;
            System.out.println("===== E-Wallet =====");
            System.out.println("Pembayaran menggunakan e-wallet berhasil sebesar " + jumlah + " sisa saldo anda: " + saldo);
        }else {
            System.out.println("Saldo anda tidak mencukupi!");
        }
    }

}
