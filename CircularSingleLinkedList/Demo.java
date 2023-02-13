package CircularSingleLinkedList;

public class Demo {
	
	public static void main(String[] args) {
		
		
		LinkedList c = new LinkedList();
		
		c.add(80);
		c.add(70);
		c.add(60);
		c.add(90);
		System.out.println(c);
		System.out.println(c.get(c.size()-1));
		c.add(0,10);
		System.out.println(c);
		c.add(c.size()-1,100);
		System.out.println(c);
		System.out.println(c.get(c.size()-1));
		
		c.remove(0);
		System.out.println(c);
		c.remove(c.size()-1);
		System.out.println(c);
		c.clear();
		System.out.println(c);
	}

}
