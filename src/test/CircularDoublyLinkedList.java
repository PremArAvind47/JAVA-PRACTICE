package test;

public class CircularDoublyLinkedList {

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

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            return;
        } 

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // 2. Insert at End
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    // 3. Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;

        head = head.next;

        head.prev = last;
        last.next = head;
    }

    // 4. Delete at End
    void deleteAtEnd() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        Node secondLast = last.prev;

        secondLast.next = head;
        head.prev = secondLast;
    }

    // 5. Traverse Forward
    void traverse() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // MAIN
    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverse(); // 5 <-> 10 <-> 20 <-> 30

        list.deleteAtBeginning();
        list.traverse(); // 10 <-> 20 <-> 30

        list.deleteAtEnd();
        list.traverse(); // 10 <-> 20
    }
}