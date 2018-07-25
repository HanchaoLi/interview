package ch1;

public class RotateMatrix {
	public static int[][] rotate(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
//		int[][] res = new int[m][n];
//		int x = 0, y = 0;
//		for (int j = 0; j < n; j++) {
//			for (int i = m - 1; i >= 0; i--) {
//				res[x][y] = arr[i][j];
//				y++;
//			}
//			y = 0;
//			x++;
//		}
//		return res;
		for (int i = 0; i < m / 2; i++) {
			for (int j = i; j < m - i - 1; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][m - 1 - i];
				arr[j][m - 1 - i] = arr[m - 1 - i][m - 1 - j];
				arr[m - 1 - i][m - 1 - j] = arr[m - 1 - j][i];
				arr[m - 1 - j][i] = temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] res = rotate(arr);
		for (int[] i : res) {
			for (int j : i) {
				System.out.println(j);
			}
		}
		System.out.println();
	}
}
