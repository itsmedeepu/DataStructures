package SearchingAlgorithms;

public class BinarySearchRec {
	
	
	public static void main(String[] args) {
		
		int[] a= {1,2,5,6,7,8,9};
		System.out.println(search(a,52,0,a.length-1));
		
		
		
	}
	
	public static int search(int[] a,int x,int start,int end) {
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(x>a[mid]) return search(a,x,mid+1,end);
		else if(x<a[mid]) return search(a,x,start,mid-1);
		return mid;
		
		
	}
	
	

}
