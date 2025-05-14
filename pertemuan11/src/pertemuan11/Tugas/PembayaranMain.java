package pertemuan11.Tugas;

public class PembayaranMain {
    public static void main (String[] args){
        EWallet e = new EWallet(100000);
        e.setJumlah(15000);
        e.prosesPembayaran();

        TransferBank tb = new TransferBank("56638910");
        tb.setJumlah(20000);
        tb.prosesPembayaran();

    }
}
