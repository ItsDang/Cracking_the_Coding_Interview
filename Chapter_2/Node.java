class Node<T> {
	private Node<T> next = null;
	private T value;


	// CONSTRUCTORS
	// default constructor
	public Node() {
		this.value = null;
	}

	// constructor with a value
	public Node(T value) {
		this.value = value;
	}

	// SETTERS

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void setValue(T value) {
		this.value = value;
	}

	// GETTERS

	public Node<T> getNext() {
		return this.next;
	}

	public T getValue() {
		return this.value;
	}

	// OTHER FUNCTIONS

	public boolean hasNext() {
		return this.next != null;
	}

	public String toString() {
		return "(" + this.value + ")";
	}
}