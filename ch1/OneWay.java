package ch1;

public class OneWay {
	public static boolean check(String s, String t) {
		if (Math.abs(s.length() - t.length()) > 1) {
			return false;
		}
		int[] arr = new int[128];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++) {
			arr[t.charAt(i)]--;
		}
		boolean sign = false;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > 1) {
				sign = true;
			}
			if (sign) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(check("please", "blese"));
	}
}
