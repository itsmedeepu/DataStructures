package sorting;

public class CountingSort {

	public static void main(String[] args) {
		int[] a = { 7, 8, 4, 3, 2, 1 };
		sort(a);

		for (int h : a) {
			System.out.println(h);
		}

	}

	public static void sort(int[] a) {

		int max = Integer.MIN_VALUE;
		int i = 0;

		while (i < a.length) {
			if (a[i] > max)
				max = a[i];

			i++;
		}

		int[] count = new int[max + 1];

		int k = 0;

		while (k < a.length) {

			count[a[k]]++;
			k++;

		}

		int counter = 0;

		for (int h = 0; h < count.length; h++) {

			while (count[h] > 0) {

				a[counter] = h;
				count[h]--;
				counter++;
			}

		}

	}

}
