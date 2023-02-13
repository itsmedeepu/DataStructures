package SingleLinkedList;

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
		Node n = new Node(ele, null);
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
		curr.next = curr.next.next;
		count--;
		
	
		
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
	
	public void reverse() {
		Node next=null;
		Node curr=first;
		Node prev=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;	
		}
		first=prev;
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
