package pertemuan10;

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.suara();
        k.makan();

        Bird b = new Bird();
        b.fly();
        b.suara();
        b.makan();

        Pesawat p = new Pesawat();
        p.fly();
    }
}
