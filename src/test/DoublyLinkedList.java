package test;

public class DoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // 1. Insert at Beginning
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        newNode.prev = null;
        head = newNode;
    }

    // 2. Insert at End
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 3. Insert After Position
    void insertAfter(int pos, int val) {
        Node temp = head;

        for (int i = 0; i < pos; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp == null) return;

        Node newNode = new Node(val);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // 4. Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // 5. Delete at End
    void deleteAtEnd() {
        if (head == null) return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        if (temp.prev != null) {
            temp.prev.next = null;
        } else {
            head = null;
        }
    }

    // 6. Traverse Forward
    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // MAIN METHOD
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverse(); // 5 <-> 10 <-> 20 <-> 30

        list.insertAfter(1, 15);
        list.traverse(); // 5 <-> 10 <-> 15 <-> 20 <-> 30

        list.deleteAtBeginning();
        list.traverse(); // 10 <-> 15 <-> 20 <-> 30

        list.deleteAtEnd();
        list.traverse(); // 10 <-> 15 <-> 20
    }
}