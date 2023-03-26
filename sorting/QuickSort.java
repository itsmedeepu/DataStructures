package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 3, 8, 9, 0 };

		sort(a, 0, a.length - 1);
		
		for(int t:a) {
			System.out.print(t+" ");
		}

	}
	
	public static void sort(int[] a,int start,int end) {
		
		if(start>=end) return;
		
		int pivot=a[(start+end)/2];
		int i=start;
		int j=end;
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,i,end);
		sort(a,start,j);
	}

}
