package test;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class Test {

    static Node top = null;

    // push
    static void push(int value){
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    // pop
    static void pop(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }

        System.out.println("Removed: " + top.data);
        top = top.next;
    }

    // peek
    static void peek(){
        if(top == null){
            System.out.println("Stack empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    // display
    static void print(){
        Node temp = top;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        print();   // 30 -> 20 -> 10

        peek();    // 30

        pop();     // remove 30

        print();   // 20 -> 10
    }
}