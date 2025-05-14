package pertemuan11;

public class Tabung extends Bentuk{
    private int tinggi;

//    construktor tanpa parameter
    public Tabung(){
        super(10);
    }

//    construktor dengan parameter
    public Tabung(int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double luas(){
        return 2*PHI*jari2*(jari2+tinggi);
    }

    // Setter & Getter

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
