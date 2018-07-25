package ch1;

public class Compress {
	public static String compress(String str) {
		if (str == null || str.length() == 0) {
			return "";
		}
		int count = 0;
		char curr = str.charAt(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == curr) {
				count++;
			} else {
				sb.append(curr).append(count);
				curr = str.charAt(i);
				count = 1;
			}
		}
		sb.append(curr).append(count);
		return sb.toString().length() < str.length() ? sb.toString() : str;
	}
	public static void main(String[] args) {
		System.out.println(compress("aabcaaddeeeeedddddddddddddd"));
	}
}
