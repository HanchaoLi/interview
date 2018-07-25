package ch2;

public class DeleteMiddle {
	public static ListNode delete(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		ListNode prev = p1;
		while (p2 != null && p2.next != null) {
			prev = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}
		prev.next = p1.next;
		return head;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode res = delete(node1);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
		
	}
}
