package Stack;

public class Demo {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(20);
		s.push(60);
		s.push(80);
		s.push(200);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		
	}

}
