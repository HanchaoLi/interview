package ch1;

public class FindPermutation {
	
	public static boolean find (String str, String permutation) {
		if (str.length() != str.length()) {
			return false;
		}
		int[] arr = new int[128];
		for (char c : str.toCharArray()) {
			arr[c]++;
		}
		for (char c : permutation.toCharArray()) {
			arr[c]--;
			if (arr[c] < 0) {
				return false;
			}
		}
//		for (int i = 0; i < str.length(); i++) {
//				if (!permutation.contains(str.charAt(i) + "")) {
//					return false;
//				}
//		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(find("abc", "abc"));
	}
}
