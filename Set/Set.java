package Set;

public class Set {

	private Node[] a = new Node[9];
	private int count;

	public boolean add(Object key) {

		int index = key.hashCode() % 10;
		if (a[index] == null) {

			a[index] = new Node(null, key);
			count++;
			return true;
		}

		Node curr = a[index];
		Node prev = null;
		while (curr != null) {
			prev = curr;
			if (curr.key.equals(key))
				return false;
			curr = curr.next;

		}
		prev.next = new Node(null, key);
		count++;
		return true;

	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (size() == 0)
			return true;
		return false;

	}
	
	public void clear() {
		a=new Node[9];
		count=0;
	}

	public void Display() {

		for (Node t : a) {
			Node curr = t;
			while (curr != null) {
				System.out.println(curr.key);
				curr = curr.next;

			}
		}
	}

}
