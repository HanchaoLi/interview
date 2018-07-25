package ch3;

import java.util.Stack;

public class StackSorting {
	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	public static void push(int val) {
		if (stack.isEmpty()) {
			stack.push(val);
		} else {
			while (!stack.isEmpty() && val > stack.peek()) {
				stack2.push(stack.pop());
			}
			stack.push(val);
			while (!stack2.isEmpty()) {
				stack.push(stack2.pop());
			}
		}
	}
	public static int pop() {
		return stack.pop();
	}
	public static int peek() {
		return stack.peek();
	}
	public static boolean isEmpty() {
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		StackSorting s = new StackSorting();
		s.push(2);
		s.push(3);
		s.push(1);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		
	}
}
