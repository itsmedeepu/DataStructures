package Queue;

public class Queue {

	private Node first;
	private Node last;
	private int count;

	public void add(Object ele) {
		if (first == null) {
			Node n = new Node(ele, null);
			first = n;
			last = n;
			count++;
			return;
		}
		Node n = new Node(ele, null);
		last.next = n;
		last = n;
		count++;

	}

	public int size() {
		return count;
	}

	public Object poll() {
		if (size() == 0)
			return null;
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
	}

	public Object peek() {
		if (size() == 0)
			return null;
		return first.ele;
	}

	public boolean isEmpty() {
		if (size() == 0)
			return true;
		return false;

	}

	public void clear() {
		first = null;
		count = 0;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + first.ele;
		Node curr = first.next;
		while (curr != null) {
			s += "," + curr.ele;
			curr = curr.next;
		}
		s += "]";
		return s;

	}

}
