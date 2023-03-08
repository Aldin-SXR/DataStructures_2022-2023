package week2;

public class LinkedList<Item> {
    private Node<Item> head;
    private int size = 0;

    public void addToFront(Item item) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void removeFromFront() {
        if (head == null) {
            throw new IndexOutOfBoundsException("The linked list is empty.");
        }
        head = head.next;
        size--;
    }

    public void addToRear(Item item) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = item;

        if (head == null) {
            head = newNode;
        } else {
            Node<Item> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeFromRear() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("The linked list is empty.");
        } else if (size == 1) {
            head = null;
        } else {
            Node<Item> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void reverse() {
        Node<Item> previous = null;
        Node<Item> current = head;

        while (current != null) {
            Node<Item> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void print() {
        Node<Item> current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
