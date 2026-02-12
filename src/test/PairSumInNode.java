package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {

	int val;
	ListNode next;

	public ListNode(int i) {
		this.val = i;
	}
}

public class PairSumInNode {
	public int addTwoNumbers(ListNode l1) {

		List<Integer> list1 = new ArrayList<>();
		ListNode temp = l1;
		while (temp != null) {
			list1.add(temp.val);
			temp = temp.next;
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != null) {
				count++;
				if(count < max) {
					max = count;
				}
			}else {
				count = max;
				count =0;
			}
		}
		return (max > count) ? max : count;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		PairSumInNode obj = new PairSumInNode();
	//	int result = obj.addTwoNumbers(l1);
System.out.println(obj.addTwoNumbers(l1));
//		while (result != null) {
//			System.out.print(result.val + " ");
//			result = result.next;
//		}
	}

}
