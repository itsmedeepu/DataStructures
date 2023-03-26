package sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] a= {2,7,4,3,1};
		sort(a);
		for(int t:a) {
			System.out.print(t+" ");
		}

	}

	public static void sort(int[] a) {
		if (a.length == 1)
			return;

		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];

		int i = 0;
		while (i < left.length) {
			left[i] = a[i];
			i++;
		}

		int j = 0;
		while (j < right.length) {
			right[j] = a[i + j];
			j++;
		}

		sort(left);
		sort(right);
		merge(left,right,a);

	}

	public static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else if (b[j] < a[i])
				c[k++] = b[j++];

		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}

	}

}
