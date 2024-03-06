public class Queue {

	// == FIELD VARIABLES == //
	private Node queueRoot;
	private Node queueTail;

	// == QUEUE METHODS == //
	public void enqueue(Node node) {
		if (!isRootAvailable(queueRoot)) {
			createRoot(node);
			return;
		} // end if

		if (queueTail == null) {
			queueTail = node;
			return;
		}

		queueTail.setNext(node);
		queueTail = node;
	}// end method

	public void dequeue() {
		Node rootNext = queueRoot.getNext();
		if (rootNext == null) {
			System.out.println("queue is empty");
			return;
		} // end if

		queueRoot = rootNext;
	}// end method

	public Node peek() {
		return queueRoot;
	}// end method

	public void size() {

	}// end method

	public boolean isEmpty() {
//		if (isRootAvailable(queueRoot)) {
//			return false;
//		} // end if

		if (queueRoot == null) {
			return true;
		}
		return false;
	}// end method

	// == OTHER METHODS == //
	public boolean isRootAvailable(Node node) {
		if (queueRoot == null) {
			System.out.println("Root of queue is does not exist, from (isRootAvailable)");
			return false;
		} // end if
		return true;
	}// end method

	public void createRoot(Node node) {
		System.out.println("creating queueRoot, from (createRoot)");
		queueRoot = node;
		queueTail = queueRoot;
	}// end method
}// end class
