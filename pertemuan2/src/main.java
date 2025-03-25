public class main {
    public static void main(String[] args) {
        ball myBall1 = new ball("red", 12, true);
        ball myBall2 = new ball("blue", 12, false);

        // System.out.println(myBall1.getColor());
        // System.out.println(myBall1.getSize());

        myBall1.showColor() ;
        myBall2.showColor();

        myBall1.showSize();
        myBall2.showSize();
    }
}