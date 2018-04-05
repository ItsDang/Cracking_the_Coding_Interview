class DeleteMiddleNode {
	public static void DeleteMiddleNode(Node<Integer> mid) {
		Node<Integer> cur = mid;
		Node<Integer> next = cur.getNext();
		while(next.hasNext()) {
			cur.setValue(next.getValue());
			cur = cur.getNext();
			next = next.getNext();
		}
		cur.setValue(next.getValue());
		cur.setNext(next.getNext());
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		int N = 5;
		int X = 10;

		System.out.println(list.toString());
		for(int i = 0; i < N; i++) {
			list.add((int) (Math.random()*X));
		}
		System.out.println(list.toString());
		DeleteMiddleNode(list.getHead().getNext());
		System.out.println(list.toString());
		DeleteMiddleNode(list.getHead().getNext().getNext());
		System.out.println(list.toString());
	}
}