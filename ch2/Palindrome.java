package ch2;

import java.util.Stack;

public class Palindrome {
	public static boolean palindrome(ListNode head) {
		ListNode l1 = head;
		ListNode l2 = head;
		Stack<ListNode> stack = new Stack<>();
		while (l2.next != null) {
			stack.push(l1);
			l1 = l1.next;
			l2 = l2.next.next;
		}
		if (l2 != null) {
			l1 = l1.next;
		}
		while (l1 != null) {
			int val = stack.pop().val;
			if (val != l1.val) {
				return false;
			}
			l1 = l1.next;
		}
		return true;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(2);
		ListNode node7 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		System.out.print(palindrome(node1) + " ");
//		while (res != null) {
//			System.out.print(res.val + " ");
//			res = res.next;
//		}
		
	}
}
