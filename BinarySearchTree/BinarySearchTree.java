package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	private int count;
	private boolean flag;

	public boolean add(int key) {
		flag = true;
		root = addNode(root, key);

		return flag;
		// loop method
//		if (root == null) {
//			root = new Node(key);
//			count++;
//			return true;
//
//		}
//		Node curr = root;
//		Node prev = null;
//		while (curr != null) {
//			prev = curr;
//			if (key<curr.ele) {
//				curr=curr.left;
//			} else if (key> curr.ele) {
//				curr = curr.right;
//			} else {
//				return false;
//
//			}
//		}
//		if (key < prev.ele) {
//			prev.left= new Node(key);
//		}
//		if (key > prev.ele) {
//			prev.right = new Node(key);
//		}
//		count++;
//		return true;

	}

	// recursive method
	private Node addNode(Node n, int key) {
		if (n == null) {
			Node n1 = new Node(key);
			count++;
			return n1;
		}
		if (key < n.ele) {
			n.left = addNode(n.left, key);
		} else if (key > n.ele) {
			n.right = addNode(n.right, key);
		} else {
			flag = false;
		}
		return n;

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
		root = null;
		count = 0;
	}

	// level order traversal
	public void levelOrder() {
		Queue<Node> l = new LinkedList<Node>();
		if (root != null) {
			l.add(root);
		}
		while (!l.isEmpty()) {
			Node p = l.poll();
			System.out.print(p.ele + " ");
			if (p.left != null)
				l.add(p.left);
			if (p.right != null)
				l.add(p.right);
		}

	}

	public void preorderTrav() {
		preOrderTrav(root);
	}

	private void preOrderTrav(Node n) {
		if (n == null)
			return;
		System.out.print(n.ele + " ");
		preOrderTrav(n.left);
		preOrderTrav(n.right);

	}

	public void postorderTrav() {
		postOrderTrav(root);
	}

	private void postOrderTrav(Node n) {
		if (n == null)
			return;
		postOrderTrav(n.left);
		postOrderTrav(n.right);
		System.out.print(n.ele + " ");

	}

	public void inorderTrav() {
		inOrderTrav(root);
	}

	private void inOrderTrav(Node n) {
		if (n == null)
			return;
		inOrderTrav(n.left);
		System.out.print(n.ele + " ");
		inOrderTrav(n.right);

	}

}
