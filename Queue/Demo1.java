package Queue;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.add(50);;
		q.add(40);
		q.add(80);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.size());
	}

}
