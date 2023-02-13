package CircularSingleLinkedList;

public class LinkedList {

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
		Node n = new Node(ele, first);
		last.next = n;
		last = n;
		count++;

	}

	public void add(int index, Object ele) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			Node n = new Node(ele, first);
			first = n;
			last.next = n;
			count++;
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		Node n = new Node(ele, curr.next);
		curr.next = n;
		count++;

	}

	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
	
		if (index == size() - 1) {
			curr.next = first;
			count--;
		} else {
			curr.next = curr.next.next;
			count--;
		}

	}
	
	public void clear() {
		first=null;
		count=0;
	}

	public int size() {

		return count;
	}

	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;

		}
		return curr.ele;

	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + first.ele;
		Node curr = first.next;
		for (int i = 1; i < size(); i++) {
			s += "," + curr.ele;
			curr = curr.next;
		}
		s += "]";
		return s;

	}

}
