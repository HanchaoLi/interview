package ch1;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	public static boolean palindrome(String str) {
		int[] arr = new int[128];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		boolean odd = false;
		for (int i = 0; i < arr.length; i++) {
			if (odd) {
				return false;
			}
			if (arr[i] % 2 == 1) {
				odd = true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome("aabrbycc"));
	}
}
