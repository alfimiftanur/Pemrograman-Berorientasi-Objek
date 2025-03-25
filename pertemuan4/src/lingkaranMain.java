public class lingkaranMain {
    public static void main(String[] args) {

        lingkaran l1 = new lingkaran(5);
        lingkaran l2 = l1;

        persistence p = new persistence();
        persistence.save(l1);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());

        l2.setJari2(12);

        persistence p1 = new persistence();
        persistence.save(l1);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
    }
}