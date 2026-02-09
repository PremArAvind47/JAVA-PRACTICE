//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class ListNode {
//
//	Integer val;
//	ListNode next;
//
//	public ListNode(Integer i) {
//		this.val = i;
//	}
//
//}
//
//public class OddEvenList {
//
//	  public static ListNode reverseList(ListNode head) {
//		  if (head == null) return null;
//		List<Integer> list = new ArrayList<>();
//		ListNode temp = head;
//		while (temp != null) {
//			list.add(temp.val);
//			temp = temp.next;
//		}
//		ListNode l = new ListNode(list.get(list.size()-1));
//		ListNode tempp = l;
//		for (int i = list.size()-2; i>=0 ; i--) {
//			tempp.next = new ListNode(list.get(i));
//			tempp = tempp.next;
//		}
//		return l;
//	}
//
//	public static void main(String[] args) {
//		ListNode listnode = new ListNode(2);
//		listnode.next = new ListNode(1);
//		listnode.next.next = new ListNode(3);
//		listnode.next.next.next = new ListNode(5);
//		listnode.next.next.next.next = new ListNode(6);
//		listnode.next.next.next.next.next = new ListNode(4);
//		listnode.next.next.next.next.next.next = new ListNode(7);
//		ListNode node = reverseList(listnode);
//		ListNode temp = node;
//		while (temp != null) {
//			System.out.println(temp.val);
//			temp = temp.next;
//		}
//
//	}
//
//}
