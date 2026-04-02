package test;

public class CircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // 1. Insert at Beginning
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // go to last node
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at End
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // 3. Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    // 4. Delete at End
    void deleteAtEnd() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = head;
    }

    // 5. Traverse
    void traverse() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // MAIN
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverse(); // 5 -> 10 -> 20 -> 30 -> back

        list.deleteAtBeginning();
        list.traverse(); // 10 -> 20 -> 30

        list.deleteAtEnd();
        list.traverse(); // 10 -> 20
    }
}