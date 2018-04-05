class ReturnKthToLast {
	// assuming k > 0, therefore k = 1 is last element and k = length is the first element.
	public static Node<Integer> returnKthToLast(SinglyLinkedList<Integer> list, int k){
		if(k > 0) {
			Node<Integer> cur = list.getHead();
			Node<Integer> next = cur;
			if(cur != null) {
				int length = 1;
				while(next.hasNext()) {
					next = next.getNext();
					length = length + 1;
				}
				if(length >= k) {
					int index = length - k;
					System.out.println(index);
					next = cur;
					while(index != 0) {
						index = index - 1;
						next = next.getNext();
					}
					return next;
				}
			}
		}
		System.out.println("K = " + k + " IS OUT OF BOUNDS.");
		return null;
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
		for(int i = -1; i < N + 1; i++) {
			Node<Integer> ret = returnKthToLast(list, i + 1);
			if(ret != null) {
				System.out.println(i + 1 + " " + ret.toString());
			}
		}
		System.out.println(list.toString());
	}
}