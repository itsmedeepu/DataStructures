package SearchingAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 6, 7, 8, 9 };
		System.out.println(search(a, 25));

	}

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;

	}

}
