package pertemuan11.Tugas;

public abstract class Pembayaran {
    protected double jumlah;

//    public Pembayaran(double jumlah){
//        this.jumlah = jumlah;
//    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public abstract void prosesPembayaran();


}
