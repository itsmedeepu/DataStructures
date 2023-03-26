package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 3, 8, 9, 0 };

		sort(a);

		for (int t : a) {
			System.out.print(t + " ");
		}

	}
	
	
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index]) index=j;
			}
			if(a[i]!=a[index]) {
				
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
		
	}

}
