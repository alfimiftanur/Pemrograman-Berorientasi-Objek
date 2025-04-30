import java.util.logging.MemoryHandler;

public class InheritanceMain {
    public static void main (String [] args){
//        Mahasiswa mhs = new Mahasiswa();
//        System.out.println("======= Tugas 1 =======");
////        mhs.setNama("Mamat");
//        System.out.println(mhs.getNama());
//
//        Mahasiswa mhs1 = new Mahasiswa();
//        System.out.println("======= Tugas 2 =======");
//        System.out.println(mhs1.getNama() + " - "+ mhs1.getAlamat());
//
//        Mahasiswa mhs2 = new Mahasiswa("Made", "Bandung");
//        System.out.println("======= Tugas 3 =======");
//        System.out.println(mhs2.getNama() + " - "+ mhs2.getAlamat());


        Mahasiswa mhs3 = new Mahasiswa("233040030", "Made", "Bandung");
        System.out.println("======= Tugas 4 =======");
        System.out.println("Nrp: " + mhs3.getNrp()+ "\nNama: "+ mhs3.getNama() + "\nAlamat:  "+ mhs3.getAlamat());
    }
}
