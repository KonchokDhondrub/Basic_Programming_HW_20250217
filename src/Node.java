public class Node {
    private Node prev;
    private int index;
    private Person value;
    private Node next;

    public Node(Node prev, int index, Person value, Node next) {
        this.prev = prev;
        this.index = index;
        this.value = value;
        this.next = next;
    }
    public int getIndex() {
        return index;
    }

    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Person getValue() {
        return value;
    }
    public void setValue(Person value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
