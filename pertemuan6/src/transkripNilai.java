import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class transkripNilai {
    private Date tglCetak;
    private double ipk;
    private List<kartuHasilStudy> daftarKHS;
    private mahasiswa mahasiswa;

    public transkripNilai(mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarKHS = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilaiSKS = 0;
        int totalSks = 0;

        for (kartuHasilStudy khs : daftarKHS) {
            for (mataKuliah mk : khs.getDaftarMataKuliah()) {
                totalNilaiSKS += mk.nilaiIndex() * mk.getSks();
                totalSks += mk.getSks();
            }
        }

        if (totalSks > 0) {
            this.ipk = totalNilaiSKS / totalSks;
        } else {
            this.ipk = 0.0;
        }
    }

    public void addKHS(kartuHasilStudy khs) {
        daftarKHS.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + String.format("%.2f", ipk));
        for (kartuHasilStudy khs : daftarKHS) {
            System.out.println(khs.display());
        }
    }
}
