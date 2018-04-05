class SinglyLinkedList<T> {
	private Node<T> head = null;

	// default constructor perhaps change to do nothing?
	public SinglyLinkedList() {
		// head = new Node<T>();
	}

	// constructor with value
	public SinglyLinkedList(T value) {
		head = new Node<T>(value);
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getHead() {
		return this.head;
	}

	// Simple insert at end of list.
	public void add(T value) {
		Node<T> next = new Node<T>(value);
		Node<T> cur = this.head;
		if(cur == null) {
			this.setHead(next);
		} else {
			while(cur.hasNext()) {
				cur = cur.getNext();
			}
			cur.setNext(next);
		}
	}

	// Simple remove from end of list.
	public void remove() {
		Node<T> cur = this.head;
		if(cur != null) {
			Node<T> next = cur.getNext();
			if(next == null) {
				this.head = null;
			} else {
				while(next.hasNext()) {
					cur = cur.getNext();
					next = next.getNext();
				}
				cur.setNext(null);
			}
		}
	}

	// Remove from index passed in, starting with index = 0.
	public void removeFrom(int index) {
		if(index >= 0) {
			Node<T> cur = this.head;
			if(cur != null) {
				Node<T> next = cur.getNext();
				if(index == 0) {
					this.setHead(next);
					return;
				}
				int i = 1;
				while(i != index) {
					if(next.hasNext()) {
						cur = cur.getNext();
						next = next.getNext();
						i = i + 1;
					} else {
						System.out.println("INDEX " + index + " IS OUT OF BOUNDS.");
						return;
					}
				}
				cur.setNext(next.getNext());
				return;
			}
		}
		System.out.println("INDEX " + index + " IS OUT OF BOUNDS.");
	}

	public void remove(T value) {
		Node<T> cur = this.head;
		if(cur != null) {
			Node<T> next = cur.getNext();
			if(cur.getValue() == value) {
				this.head = next;
				return;
			}
			while(next != null) {
				if(next.getValue() != value) {
					cur = cur.getNext();
					next = next.getNext();
				} else {
					cur.setNext(next.getNext());
					return;
				}
			}
		}
	}

	public int length() {
		int length = -1;
		Node<T> cur = this.head;
		if(cur != null) {
			length = 0;
			while(cur != null) {
			length = length + 1;
			cur = cur.getNext();
			}
		}
		return length;
	}

	public String toString() {
		StringBuilder ts = new StringBuilder();
		Node<T> cur = this.head;
		if(cur == null) {
			return "EMPTY";
		} else {
			while(cur.hasNext()) {
				ts.append(cur.toString() + "->");
				cur = cur.getNext();
			}
			ts.append(cur.toString());
			return ts.toString();
		}
	}

}