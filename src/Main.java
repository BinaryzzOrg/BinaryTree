
public class Main {

	public static void main(String[] args) {
		TreeClass tree = new TreeClass();
		Node root = new Node(10);
		Node input1 = new Node(1);
		Node input2 = new Node(30);
		Node input3 = new Node(12);
		Node input4 = new Node(9);

		tree.insert(root);
		tree.insert(input1);
		tree.insert(input2);
		tree.insert(input3);
		tree.insert(input4);
		tree.preOrderTraversal(root);
	}// end main
}// end class
