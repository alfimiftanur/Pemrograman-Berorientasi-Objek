public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

//    konstruktor
    public Matakuliah(String kode, String nama, String index, int sks){
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public int getSks(){
        return sks;
    }
    public double nilaiIndex(){
        switch (index){
            case "A":
                return 4;
            case "AB":
                return 3.5;
            case "B":
                return 3;
            case "BC":
                return 2.5;
            case "C":
                return 2;
            case "D":
                return 1;
            case "E":
                return 0;
        }
        return 0;
    }

    public String display(){
        return kode + " - " + nama + " - " + index;
    }
}
