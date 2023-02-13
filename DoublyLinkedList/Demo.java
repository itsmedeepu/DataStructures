package DoublyLinkedList;

public class Demo {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(50);
		l.add(40);
		l.add(30);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(l.size()-1));
		System.out.println(l);
	}

}
