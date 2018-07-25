package ch3;

public class StackOfPlates {
	static int[] stack = new int[900];
	static int limit = 300;
	static int currentIndex = 0;
	static int currentStack = 1;
	public static void push(int val) {
		if (currentIndex / 2 < limit) {
			stack[currentIndex] = val;
			currentIndex++;
		}
		
	}
	public static int pop(int val) {
		
	}
	public static void main(String[] args) {
		
	}
}
