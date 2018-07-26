package ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTSequence {
	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode node) {
	    ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();

	    if (node == null){
	        result.add(new LinkedList<Integer>());
	        return result;
	    }

	    LinkedList<Integer> prefix = new LinkedList<Integer>();
	    prefix.add(node.val);

	    ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left);
	    ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);

	    // weave
	    for (LinkedList<Integer> left : leftSeq) {
	        for (LinkedList<Integer> right : rightSeq) {
	            ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
	            weaveLists(left, right, weaved, prefix);
	            result.addAll(weaved);
	        }
	    }
	    return result;
	}
	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
		    ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		    // one list is empty. Add remainder to [a cloned] prefix and store result.
		    if (first.size() == 0 || second.size() == 0){
		        LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
		        result.addAll(first);
		        result.addAll(second);
		        results.add(result);
		        return ;
		    }

		    // Recurse with head of first added to the prefix. Removing the head will
		    // damage first, so we'll need to put it back where we found it afterwards.
		    int headFirst = first.removeFirst();
		    prefix.addLast(headFirst);
		    weaveLists(first, second, results, prefix);
		    prefix.removeLast();
		    first.addFirst(headFirst);

		    // Do the same thing with second, damaging and then restoring the list
		    int headSecond = second.removeFirst();
		    prefix.addLast(headSecond);
		    weaveLists(first, second, results, prefix);
		    prefix.removeLast();
		    second.addFirst(headSecond);
		}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(0);
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(4);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.left = node4;
		node2.left = node5;
		node2.right = node6;
		node4.left = node7;
		node4.right = node8;
		List<LinkedList<Integer>> res = allSequences(root);
		for (List<Integer> i : res) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
