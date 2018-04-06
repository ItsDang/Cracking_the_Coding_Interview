class BinaryNode<T> {
	private BinaryNode<T> left = null;
	private BinaryNode<T> right = null;
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

	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}

	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}

	public void setValue(T value) {
		this.value = value;
	}

	// GETTERS

	public BinaryNode<T> getLeft() {
		return this.left;
	}

	public BinaryNode<T> getRight() {
		return this.right;
	}

	public T getValue() {
		return this.value;
	}

	// OTHER FUNCTIONS

	public String toString() {
		return "(" + this.value + ")";
	}
}