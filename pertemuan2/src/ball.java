public class ball {
    private String color;
    private int size;
    private Boolean moveStatus;

    //constructor
    public ball(String color, int size, boolean moveStatus) {
        this.color = color;
        this.size = size;
        this.moveStatus = moveStatus;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void move() {
        moveStatus = true;
        System.out.println("The ball is moving...");
    }

    public void stop() {
        moveStatus = false;
        System.out.println("The ball is stopping ");
    }

    public void showStatus() {
        String status = moveStatus ? "moving" : "not moving";
        System.out.println("The ball is currently " +status + ".");

        // String status;
        // if (moveStatus = true) {
        //     status = "moving";
        // }else {
        //     status = 'not moving';
        // }
    }

    // public void setStatus(){
    //     return status = moveStatus ? "moving" : "not moving";
    // }
    public void showColor() {
        System.out.println("The color of the ball is " + color + ".");
    }

    public void showSize() {
        System.out.println("The color of the ball is " + size + ".");
    }

}
