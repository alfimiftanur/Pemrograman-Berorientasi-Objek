package pertemuan11.Tugas;

public class TransferBank extends Pembayaran{
    protected String rekening;

    public TransferBank(String rekening){
        this.rekening = rekening;
    }
    @Override
    public void prosesPembayaran(){
        System.out.println("===== Transfer Bank =====");
        System.out.println("Transfer bank ke rekening "+  rekening + " dengan nominal " + jumlah);
    }

}
