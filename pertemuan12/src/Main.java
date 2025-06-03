public class Main {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new Tabung(7, 10);


        System.out.println("Luas Lingkaran: " + b1.hitungLuas());
        System.out.println("Luas Tabung: " + b2.hitungLuas());
    }
}
