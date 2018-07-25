package ch2;

public class Loop {
	public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(3);
//		ListNode node4 = new ListNode(4);
//		ListNode node5 = new ListNode(5);
//		ListNode node6 = new ListNode(6);
//		ListNode node7 = new ListNode(3);
		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node6;
//		node6.next = node7;
		System.out.print(hasCycle(node1));
//		while (res != null) {
//			System.out.print(res.val + " ");
//			res = res.next;
//		}
		
	}
}
