package CircularDoublyLinkedList;

public class Node {

	Object e;
	Node prev;
	Node next;

	Node(Node prev, Object e, Node next) {

		this.prev = prev;
		this.e = e;
		this.next = next;
	}

}
