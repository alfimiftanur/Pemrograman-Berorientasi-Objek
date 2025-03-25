public class transkripNilaiMain {
    public static void main(String[] args) {

//    crate object matakuliah
        mataKuliah mk1 = new mataKuliah("001", "Algoritma Pemrograman 1", "A", 3, "Leony");
        mataKuliah mk2 = new mataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Leony");
        mataKuliah mk3 = new mataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Siroj Nur Ulum, S.T., M.T.");

//    create object khs
        kartuHasilStudy khs = new kartuHasilStudy("2025");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);
        khs.hitungIPS();
//    create object mahasiswa
        mahasiswa mhs = new mahasiswa("23304001", "Jhon");

//    create object transkripNilai
        transkripNilai transkrip = new transkripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK();
        transkrip.display();

    }
}