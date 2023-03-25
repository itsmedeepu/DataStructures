package CircularDoublyLinkedList;

public class Test {

	public static void main(String[] args) {

		CircularDoublyLikedList circularDoublyLikedList = new CircularDoublyLikedList();
		circularDoublyLikedList.add(10);
		circularDoublyLikedList.add(20);
		circularDoublyLikedList.add(30);
		circularDoublyLikedList.add(0,4);
		circularDoublyLikedList.remove(3);
		System.out.println(circularDoublyLikedList);
		
		
		String reverse = circularDoublyLikedList.reverse();
		System.out.println(reverse);
	}

}
