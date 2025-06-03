public class Tabung extends  Lingkaran{
    private double tinggi;
    public Tabung (double radius, double tinggi){
        super(radius);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
            // Luas permukaan tabung = 2πr(r + t)
//        return 2 * Math.PI * r * (r + tinggi);

//        2 * phi * r * r + 2 * phi (r+t)
        return 2 * super.hitungLuas() + 2 * Math.PI * getRadius()  * tinggi;
    }
}
