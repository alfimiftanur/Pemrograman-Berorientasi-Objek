package tugas;

public class Karyawan extends Orang{
//    Tugas latihan 3
//    public Karyawan(String nama, String alamat){
//        super(nama, alamat);
//    }

//    tugas latihan 4
    private int gaji;
    public Karyawan(String nama, String alamat, int gaji){
        super(nama, alamat);
        this.gaji = gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
