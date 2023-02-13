package SingleLinkedList;

public class Demo {
	
	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		a.add(20);
		a.add(40);
		a.add(70);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		a.add(a.size()-1,10);
		a.remove(a.size()-1);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
	}

}
