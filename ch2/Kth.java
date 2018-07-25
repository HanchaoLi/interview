package ch2;
class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
	}
}
public class Kth {
	public static ListNode kth(ListNode head, int k) {
//		int count = 0;
//		ListNode curr = head;
//		while (curr != null) {
//			count++;
//			curr = curr.next;
//		}
//		curr = head;
//		int pos = count - k > 0 ? count - k : 0;
//		while (curr != null) {
//			if (pos > 0) {
//				curr = curr.next;
//				pos--;
//			} else {
//				break;
//			}
//		}
		ListNode p1 = head;
		ListNode p2 = head;
		for (int i = 0; i < k && p1 != null; i++) {
			p1 = p1.next;
		}
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		ListNode res = kth(node1, 3);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
		
	}
}
