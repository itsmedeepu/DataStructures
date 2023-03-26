package sorting;

public class InsertionSort {
	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 3, 8, 9, 0 };

		sort(a);

		for (int t : a) {
			System.out.print(t + " ");
		}

	}

	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int key = a[i];

			while (j > -1 && a[j] > key) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = key;

		}
	}

}
