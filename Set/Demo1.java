package Set;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Set s = new Set();
		s.add(new Student(1,"deepak",250));
		s.add(new Student(20,"raju",20));
		s.add(new Student(70,"ramesh",50));
		s.add(new Student(25,"rahul",70));
		s.add(new Student(1,"deepak",250));
		s.Display();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
	}

}
