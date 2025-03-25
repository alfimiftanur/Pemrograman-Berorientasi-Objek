public class mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public boolean hadir;

    public mahasiswa (String nim, String nama,String alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void masukKelas (){
        this.hadir = true;
    }
}
