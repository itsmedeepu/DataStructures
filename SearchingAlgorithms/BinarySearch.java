package SearchingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 6, 7, 8, 9 };
		System.out.println(search(a, 6));

	}

	public static int search(int[] a, int x) {
		int i = 0;
		int j = a.length - 1;
		while (i <= j) {

			int mid = (i + j) / 2;
			if (x > a[mid])
				i = mid + 1;
			else if (x < a[mid])
				j = j - 1;
			else
				return mid;

		}
		return -1;

	}

}
