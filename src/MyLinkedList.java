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

    @Override
    public Person get(int index) {
        if (index>=0 && index<=size){
            return getByIndex(index);
        }
        return null;
    }

    private Person getByIndex(int index){
        int counter = 0;
        if(index<0 || index>=size){
            return null;
        }
        Node current = head;
        while (current != null && counter<index) {
            if (current.getIndex() == index) {
                counter++;
                return current.getValue();
            }
            counter++;
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public void print() {
        Node node = head;
        while (node!=null){
            System.out.printf("[%d] ",node.getIndex());
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
        private int index;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
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

}
