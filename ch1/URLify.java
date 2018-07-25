package ch1;

public class URLify {
	public static String url(String str, int len) {
		char[] ch = str.toCharArray();
		int space = 0;
		for (int i = 0; i < len; i++) {
			if (ch[i] == ' ') {
				space++;
			}
		}
		int actual = space * 2 + len;
		if (len < str.length()) ch[len] = '\0';
		for (int i = len - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				ch[actual - 1] = '0';
				ch[actual - 2] = '2';
				ch[actual - 3] = '%';
				actual = actual - 3;
			} else {
				ch[actual - 1] = ch[i];
				actual--;
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		System.out.println(url("Mr john sm4ith    ", 14));
	}
}
