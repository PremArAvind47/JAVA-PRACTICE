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
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum1 = 0;
		ListNode temp = l1;
		while (temp != null) {
			sum1 = sum1*10 + temp.val;
			temp = temp.next;
		}
		int sum11 = 0;
		ListNode temp1 = l2;
		while (temp1 != null) {
			sum11 = sum11*10 + temp1.val;
			temp1 = temp1.next;
		}
		int s1 = 0;
		while (sum1 != 0) {
			int num = sum1 % 10;
			s1 = s1*10 + num;
			sum1 = sum1 / 10;
		}
		int s2 = 0;
		while (sum11 != 0) {
			int num = sum11 % 10;
			s2 = s2*10 + num;
			sum11 = sum11 / 10;
		}
		int sum = s1 + s2;
		System.out.println(sum);
		List<Integer> s = new ArrayList<>();

		while (sum != 0) {
			int num = sum % 10;
			s.add(num);
			sum = sum / 10;
		}
		if(s.size() ==0) {
		ListNode tt = new ListNode(0);
				return tt;};
		if(s.size() ==1) {s.get(0);};
		ListNode list = new ListNode(s.get(0));
		ListNode tempp = list;
		int h = s.size() - 1;
		for (int i = 1; i <= s.size() - 1; i++) {
			tempp.next = new ListNode(s.get(i));
			tempp = tempp.next;
		}
		return list;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		PairSumInNode obj = new PairSumInNode();

		ListNode result = obj.addTwoNumbers(l1, l2);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
