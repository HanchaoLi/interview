package ch2;

public class Partition {
	public static ListNode partition(ListNode head, int x) {
		
        ListNode before = head;
        ListNode after = head;
        
        while (head != null) {
        	if (head.val < x) {
        		head.next = before;
        		before = head;
        	} else {
        		after.next = head;
        		after = head;
        	}
        	head = head.next;
        }
        return after;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode res = partition(node1, 3);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
		
	}
}
