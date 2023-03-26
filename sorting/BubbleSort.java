package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 3, 8, 9, 0 };

		sort(a);

		for (int t : a) {
			System.out.print(t + " ");
		}

	}

	public static void sort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

	}

}
