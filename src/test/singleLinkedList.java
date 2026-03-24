package test;

public class singleLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1. Insert at Beginning
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
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
    }

    // 3. Insert at Position (after index)
    void insertAfter(int pos, int val) {
        Node temp = head;

        for (int i = 0; i < pos; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp == null) return;

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    // 5. Traverse
    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // 6. Search
    void search(int key) {
        Node temp = head;
        int pos = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Not found");
    }

    // MAIN METHOD (test everything)
    public static void main(String[] args) {

        singleLinkedList list = new singleLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverse();  // 5 -> 10 -> 20 -> 30 -> NULL

        list.insertAfter(1, 15);
        list.traverse();  // 5 -> 10 -> 15 -> 20 -> 30 -> NULL

        list.deleteAtBeginning();
        list.traverse();  // 10 -> 15 -> 20 -> 30 -> NULL

        list.search(20);  // Found
        list.search(100); // Not found
    }
}