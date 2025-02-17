public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    private Node node;

    @Override
    public void add(Person element) {
        node = new Node(null, size, element , null);
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
    public Person get(int index) {
        if (index>=0 && index<=size){
            Node current = head;
            while (current != null) {
                if (current.getIndex() == index) {
                    return current.getValue();
                }
                current = current.getNext();
            }
        }
        return null;
    }

    @Override
    public void print() {
        Node node = head;
        while (node!=null){
            System.out.print(node.getIndex() + " ");
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
