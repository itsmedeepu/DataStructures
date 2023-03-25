package CircularDoublyLinkedList;

public class CircularDoublyLikedList {
  Node first;
  int count = 0;
  Node next;
  Node last;

  public void add(Object e) {
    if (first == null) {

      Node n = new Node(null, e, first);
      first = n;
      last = n;
      count++;
      return;
    }
    Node n = new Node(last, e, first);
    last.next = n;
    first.prev = n;
    last = n;
    count++;

  }

  public int size() {

    return count;
  }

  public void add(int index, Object e) {

    if (index <= -1 || index >= count) {

      throw new ArrayIndexOutOfBoundsException();
    }
    // while adding node to zero index
    if (index == 0) {
      // storing first node in temp node
      Node temp = first;
      // creating a new node
      Node n = new Node(temp.prev, e, temp);
      // linking the node according to the chain
      temp.prev.next = n;
      temp.prev = n;
      // update the first node reference
      first = n;
      // update the last node reference
      last = n;
      // increment the count
      count++;
      return;

    }

    // condition 2 while adding node to other than zero index

    // iterate or move to index-1 position
    Node cur = first;
    for (int i = 1; i < index; i++) {
      cur = cur.next;
    }
    // create a new Node
    Node n = new Node(cur, e, cur.next);
    cur.next.prev = n;
    cur.next = n;
    last = n;
    count++;

  }

  public void remove(int index) {

    if (index <= -1 || index >= count) {

      throw new ArrayIndexOutOfBoundsException();
    }
    if (index == 0) {

      Node temp = first;
      first = first.next;
      temp.next.prev = temp.prev;
      temp.prev.next = first;
      count--;
      return;

    }
    Node curr = first;
    for (int i = 1; i < index; i++) {
      curr = curr.next;
    }

    Node temp = curr.next;
    curr.next = temp.next;
    temp.next.prev = curr;
    count--;

  }

  @Override
  public String toString() {

    String s = "[" + first.e;
    Node curr = first.next;
    for (int i = 2; i <= size(); i++) {
      s += "," + curr.e;
      curr = curr.next;

    }
    s += "]";
    return s;

  }

  public String reverse() {

    String s = "[" + first.prev.e;
    Node curr = first.prev;
    for (int i = size() - 1; i >= 1; i--) {
      curr = curr.prev;
      s += "," + curr.e;

    }
    s += "]";
    return s;

  }

  public void clear() {

    first = null;
    count = 0;

  }

  public Object get(int index) {

    if (index <= -1 || index >= count) {

      throw new ArrayIndexOutOfBoundsException();
    }
    Node curr = first;
    for (int i = 1; i <= index; i++) {
      curr = curr.next;

    }
    return curr.e;

  }

}