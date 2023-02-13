package BinarySearchTree;

public class Demo {
	
	public static void main(String[] args) {
		
		BinarySearchTree b = new BinarySearchTree();
		b.add(50);
		b.add(25);
		b.add(65);
		b.add(25);
		b.add(90);
		b.add(64);
		System.out.println("*******leve-order traverse******");
		b.levelOrder();
		System.out.println();
		System.out.println("*******pre-order traverse******");
		b.preorderTrav();
		System.out.println();
		System.out.println("*******post-order traverse******");
		b.postorderTrav();
		System.out.println();
		System.out.println("*******in-order traverse******");
		b.inorderTrav();
	}

}
