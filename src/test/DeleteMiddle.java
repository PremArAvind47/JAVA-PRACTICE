package test;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int i) {
		this.val = i;
	}

}

public class DeleteMiddle {
	static ListNode deleteMiddle(ListNode head) {

	    if (head.next == null) return null; // size 1

	    // count nodes
	    int count = 0;
	    ListNode temp = head;
	    while (temp != null) {
	        count++;
	        temp = temp.next;
	    }

	    int mid = count / 2;

	    // walk to node before middle
	    ListNode curr = head;
	    for (int i = 0; i < mid - 1; i++) {
	        curr = curr.next;
	    }

	    // delete middle
	    curr.next = curr.next.next;

	    return head;
	}


	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		deleteMiddle(head);
	}

}
