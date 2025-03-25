public class NodeMain {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        node1.setNext(node2);

        System.out.println("Node 1 value: " + node1.getValue());
        System.out.println("Node 2 value: " + node1.getNext().getValue());
    }
}
