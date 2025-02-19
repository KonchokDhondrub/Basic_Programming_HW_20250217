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
            tail.next = node;
            node.prev = tail;
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
        Node prevNode = currentNode.prev;
        Node nextNode = currentNode.next;

        if (prevNode != null){
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }

        if (nextNode != null){
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }
        size--;

        currentNode.prev = null;
        currentNode.next = null;
    }

    @Override
    public Person get(int index) {
        if (index>=0 && index<=size){
            return getByIndex(index).value;
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
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    @Override
    public void print() {
        Node node = head;
        while (node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    @Override
    public String toString(){
        String result = "";
        Node currentNode = head;
        while (currentNode!=null){
            result+= currentNode.value + System.lineSeparator();
            currentNode= currentNode.next;
        }
        return result;
    }

    private static class Node {
        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
