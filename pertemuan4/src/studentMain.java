public class studentMain {
    public static void main(String[] args) {
        student x = new student();
        student y = x;

        x.setNrp("01");
        y.setNrp("02");

        System.out.println(x.getNrp());

        student z = new student();
        z.setNrp("03");
        x = z;

        System.out.println(x.getNrp());
        System.out.println(y.getNrp());
    }
}
