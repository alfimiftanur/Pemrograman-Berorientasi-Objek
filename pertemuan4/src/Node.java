public class Node {
    private int value;
    private Node node;
//    konstruktor
    public Node(int value) {
        this.value = value;
    }
//    getter
    public int getValue() {
        return value;
    }
    public Node getNext() {
        return node;
    }
//    setter
    public void setValue(int value) {
        this.value = value;
    }
    public void setNext(Node next) {
        this.node = next;
    }
}
