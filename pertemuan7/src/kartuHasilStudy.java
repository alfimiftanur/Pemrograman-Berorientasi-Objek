import java.util.ArrayList;
import java.util.List;

public class kartuHasilStudy {
    public String semester;
    private double ips;
    private List<mataKuliah> daftarMataKuliah;

    public kartuHasilStudy(String semester){
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah (mataKuliah matakuliah){
        daftarMataKuliah.add(matakuliah);
    }
    public String display(){
        System.out.println("Semester: " + semester);
        StringBuilder sb = new StringBuilder();
        for (mataKuliah mk : daftarMataKuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        if (daftarMataKuliah.isEmpty()) {
            this.ips = 0.0;
            return;
        }

        double totalNilaiSKS = 0;
        int totalSks = 0;

        for (mataKuliah mk : daftarMataKuliah) {
            totalNilaiSKS += mk.nilaiIndex() * mk.getSks();
            totalSks += mk.getSks();
        }

        this.ips = totalNilaiSKS / totalSks;
    }

    public List<mataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public double getIps() {
        return ips;
    }
}
