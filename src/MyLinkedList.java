public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    private Node node;

    @Override
    public void add(Person element) {
        node = new Node(null, element, null);
        if (head == null){
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    public void remove(int index){
        Node currentNode = getByIndex(index);
        Node prevNode = currentNode.getPrev();
        Node nextNode = currentNode.getNext();

        if (prevNode != null){
            prevNode.setNext(nextNode);
        } else {
            head = nextNode;
        }

        if (nextNode != null){
            nextNode.setPrev(prevNode);
        } else {
            tail = prevNode;
        }
        size--;

        currentNode.setPrev(null);
        currentNode.setNext(null);
    }

    @Override
    public Person get(int index) {
        if (index>=0 && index<=size){
            return getByIndex(index).getValue();
        }
        return null;
    }
    private Node getByIndex(int index){
        int counter = 0;
        if(index<0 || index>=size){
            return null;
        }

        Node currentNode = head;
        while (currentNode != null && counter<index) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode;
    }

    @Override
    public void print() {
        Node node = head;
        while (node!=null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public String toString(){
        String result = "";
        Node currentNode = head;
        while (currentNode!=null){
            result+= currentNode.getValue() + System.lineSeparator();
            currentNode= currentNode.getNext();
        }
        return result;
    }

    public static class Node {
        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
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
}
