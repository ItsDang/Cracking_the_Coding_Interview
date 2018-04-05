import java.util.HashSet;
class RemoveDups {
	// Removal using a HashSet to store the seen values and without via a triple runner.
	public static void removeDups(SinglyLinkedList<Integer> list, boolean buffer){
		if(buffer) {
			HashSet<Integer> seen = new HashSet<Integer>();
			Node<Integer> cur = list.getHead();
			if(cur != null) {
				Node<Integer> next = cur.getNext();
				while(next != null) {
					seen.add(cur.getValue());
					if(!seen.contains(next.getValue())) {
						cur = cur.getNext();
						next = next.getNext();
					} else {
						cur.setNext(next.getNext());
						next = cur.getNext();
					}
				}
			}
		} else {
			// Value to compare to 
			Node<Integer> cur = list.getHead();
			if(cur != null) {
				while(cur != null && cur.getNext() != null) {
					Node<Integer> dupCur = cur;
					Node<Integer> dupNext = cur.getNext();
					while(dupNext != null) {
						if(dupNext.getValue() != cur.getValue()) {
							dupCur = dupCur.getNext();
							dupNext = dupNext.getNext();
						} else {
							// Remove dupNext from list
							dupCur.setNext(dupNext.getNext());
							dupNext = dupNext.getNext();
						}
					}
					cur = cur.getNext();
				}
			}
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		int N = 5;
		int X = 10;

		System.out.println("With Buffer");
		// list.add(1);
		// list.add(1);
		// for(int i = 0; i < N; i++) {
		// 	list.add((int) (Math.random()*X));
		// }
		System.out.println(list.toString());
		removeDups(list, true);
		System.out.println(list.toString());

		System.out.println("Without Buffer");
		// list.add(1);
		// for(int i = 0; i < N; i++) {
		// 	list.add((int) (Math.random()*X));
		// }
		System.out.println(list.toString());
		removeDups(list, false);
		System.out.println(list.toString());
	}
}