public class MatakuliahMain {
    public static void main (String[] args){
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double totalNilaiSKS = (mk1.nilaiIndex() * mk1.getSks()) + (mk2.nilaiIndex() * mk2.getSks()) + (mk3.nilaiIndex() * mk3.getSks());
        double ipk = totalNilaiSKS / totalSks;
        System.out.println("Total SKS: " + totalSks);
        System.out.printf("IPK: %.2f", ipk);
    }
}
