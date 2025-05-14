package pertemuan11;

public class Main {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10);
        System.out.println("== Lingkaran ==");

        System.out.println("Jari2: "+l.getJari2());
        System.out.println("Luas: " + l.luas());

        Tabung t = new Tabung(10,5);
        System.out.println("== Tabung ==");

        System.out.println("Jari2: "+ t.getJari2() + ", " + "Tinggi: " + t.getTinggi());
        System.out.println("Luas: " + t.luas());

    }
}