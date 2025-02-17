public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    @Override
    public void add(String element) {
        Node node = new Node(null, element , null);
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public void print() {
        Node node = head;
        while (node!=null){
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }
}
