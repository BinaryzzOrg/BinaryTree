
public class TreeClass {
	// == FIELD VARIABLES == //
	private Node root;

	// == TREE METHODS == //
	public void insert(Node userInputNode) {
		if (!isRootAvailable(root)) {
			createRoot(userInputNode);
			return;
		} // end if

		Node pointer = userInputNode;
		Queue queue = new Queue();
		queue.enqueue(pointer);

		while (!queue.isEmpty()) {
			System.out.println("test");
			pointer = queue.peek();
			queue.dequeue();
			System.out.println("pointer: " + pointer.getData());

			if (pointer.getLeftChild() == null) {
				pointer.setLeftChild(userInputNode);
				break;
			} else {
				queue.enqueue(pointer);
			} // end if else

			if (pointer.getRightChild() == null) {
				pointer.setRightChild(userInputNode);
				break;
			} else {
				queue.enqueue(pointer);
			} // end if else

		} // end while
	}// end method

	// == OTHER METHODS == //
	public boolean isRootAvailable(Node node) {
		if (node == null) {
			System.out.println("Root not available, from (isRootAvailable)");
			return false;
		} // end if
		return true;
	}// end method

	public void createRoot(Node userInputNode) {
		System.out.println("creating root, from (createRoot)");
		root = userInputNode;
	}// end method

	public void preOrderTraversal(Node node) {
		if (!isRootAvailable(root)) {
			System.out.println("No root, from (print method)");
			return;
		} // end if

		if (node == null) {
			return;
		}
		System.out.println(node.getData());
		preOrderTraversal(node.getLeftChild());
		preOrderTraversal(node.getRightChild());
	}// end method
}// end class
