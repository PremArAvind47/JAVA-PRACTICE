package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNodee {
	int val;
	ListNodee next;

	ListNodee(int val) {
		this.val = val;
	}

}

public class MergeTwoLists {

	public static ListNodee mergeTwoLists(ListNodee list1, ListNodee list2) {

		if(list1 == null  && list2 == null) {
			ListNodee h = new ListNodee(0);
			return h;
		}
		ListNodee temp = list1;
		ListNodee h = null;
		ListNodee t = null;
		while (temp != null) {
			if (t == null) {
				ListNodee node = new ListNodee(temp.val);
				h = node;
				t = node;
				temp = temp.next;
				continue;
			}
			ListNodee node = new ListNodee(temp.val);
			t.next = node;
			t = node;
			temp = temp.next;

		}

		ListNodee tempp = list2;
		while (tempp != null) {
			ListNodee node = new ListNodee(tempp.val);
			t.next = node;
			t = node;
			tempp = tempp.next;

		}
		List<Integer> list = new ArrayList<>();

		while (h != null) {
			list.add(h.val);
			h = h.next;

		}
		Collections.sort(list);
	
		ListNodee h1 = null;
		ListNodee t1 = null;
		for (Integer l : list) {
			if (h1 == null) {
				ListNodee node = new ListNodee(l);
				h1 = node;
				t1 = node;
				continue;
			}
			ListNodee node = new ListNodee(l);
		    t1.next = node;
			t1 = node;
			
			
                 
		}

		return h1;

	}

	public static void main(String[] args) {
		ListNodee node1 = new ListNodee(1);
		node1.next = new ListNodee(7);
		node1.next.next = new ListNodee(3);

		ListNodee node2 = new ListNodee(4);
		node2.next = new ListNodee(5);
		node2.next.next = new ListNodee(6);

		ListNodee tt = mergeTwoLists(node1, node2);

		while (tt != null) {
			System.out.println(tt.val);
			tt = tt.next;

		}

	}

}
