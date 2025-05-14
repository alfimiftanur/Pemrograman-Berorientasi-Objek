package pertemuan11;

public class Lingkaran extends Bentuk{
    public Lingkaran(int jari2){
        super(jari2);
    }

//    diambil dari kelas Bentuk
    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
