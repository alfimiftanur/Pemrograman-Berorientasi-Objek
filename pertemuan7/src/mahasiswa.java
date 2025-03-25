public class mahasiswa {
    private String nrp;
    private String nama;

    public mahasiswa(){
    }
    public mahasiswa (String nrp, String nama){
        super();
        this.nrp = nrp;
        this.nama = nama;
    }
    public String displayMhs(){
        return "NRP : " + nrp + " Nama : " + nama;
    }
//    setter & getter
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNrp() {
        return nrp;
    }
    public String getNama() {
        return nama;
    }
}


