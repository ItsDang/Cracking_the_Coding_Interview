class SumLists{
	public static SinglyLinkedList<Integer> sumLists(SinglyLinkedList<Integer> l1, SinglyLinkedList<Integer> l2, boolean backwards) {
		Node<Integer> cur1 = l1.getHead();
		Node<Integer> cur2 = l2.getHead();
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		int carry = 0;
		if(backwards) {
			while(cur1 != null && cur2 != null) {
				int sum = cur1.getValue() + cur2.getValue() + carry;
				list.add(sum % 10);
				carry = sum / 10;
				cur1 = cur1.getNext();
				cur2 = cur2.getNext();
			}
			while(cur1 != null) {
				int sum = cur1.getValue() + carry;
				list.add(sum % 10);
				carry = sum / 10;
				cur1 = cur1.getNext();
			}
			while(cur2 != null) {
				int sum = cur2.getValue() + carry;
				list.add(sum % 10);
				carry = sum / 10;
				cur2 = cur2.getNext();
			}
			if(carry != 0) {
				list.add(carry);
			}
		} else {
			int l1i = 0;
			while(cur1 != null) {
				l1i = l1i + cur1.getValue();
				if(cur1.hasNext()) {
					l1i = l1i * 10;
				}
				cur1 = cur1.getNext();
			}
			int l2i = 0;
			while(cur2 != null) {
				l2i = l2i + cur2.getValue();
				if(cur2.hasNext()) {
					l2i = l2i * 10;
				}
				cur2 = cur2.getNext();
			}
			int listi = l1i + l2i;
			for(int i = (int) Math.floor(Math.log10((double)listi)); i > -1; i--) {
				list.add(listi / (int) Math.pow(10.0, (double)i) % 10);
			}
		}
	 	return list;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> l1 = new SinglyLinkedList<Integer>();
		SinglyLinkedList<Integer> l2 = new SinglyLinkedList<Integer>();
		int N = 5;
		int X = 10;

		// Create 2 lists.
		for(int i = 0; i < N; i++) {
			l1.add((int) (Math.random()*X));
		}
		System.out.println("L1 " + l1.toString());
		SinglyLinkedList<Integer> list;
		list = sumLists(l1, l2, true);
		System.out.println("BSum " + list.toString());
		list = sumLists(l1, l2, false);
		System.out.println("FSum " + list.toString());
		for(int i = 0; i < N; i++) {
			System.out.println();
			l2.add((int) (Math.random()*X));
			System.out.println("L1 " + l1.toString());
			System.out.println("L2 " + l2.toString());
			list = sumLists(l1, l2, true);
			System.out.println("BSum " + list.toString());
			list = sumLists(l1, l2, false);
			System.out.println("FSum " + list.toString());
		}
	}
}