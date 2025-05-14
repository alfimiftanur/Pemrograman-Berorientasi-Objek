package pertemuan10;

public class Bird extends Hewan implements Flyable{

    @Override
    void suara() {
        System.out.println("Wow");
    }
    @Override
    public void fly() {
        System.out.println("Burung terbang menggunakan sayap");
    }
}
