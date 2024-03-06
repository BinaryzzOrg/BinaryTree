
public class Node {

	// == FIELD VARIABLES == //
	private int data;
	private Node next;
	private Node leftChild;
	private Node rightChild;

	// == CONSTRUCTOR == //
	public Node(int data) {
		this.setData(data);
		this.leftChild = null;
		this.rightChild = null;
		this.next = null;
	}// end constructor

	// == GETTER SETTER == //
	public int getData() {
		return data;
	}// end method

	public void setData(int data) {
		this.data = data;
	}// end method

	public Node getLeftChild() {
		return leftChild;
	}// end method

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}// end method

	public Node getRightChild() {
		return rightChild;
	}// end method

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}// end method

	public Node getNext() {
		return next;
	}// end method

	public void setNext(Node next) {
		this.next = next;
	}// end method
}// end class
