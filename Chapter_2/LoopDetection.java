import java.util.HashSet;
class LoopDetection {
	public static Node<Integer> loopDetection(SinglyLinkedList<Integer> l1) {
		HashSet<Node<Integer>> seen = new HashSet<Node<Integer>>();
		Node<Integer> cur = l1.getHead();
		while(cur != null) {
			if(seen.contains(cur)) {
				return cur;
			} else {
				seen.add(cur);
				cur = cur.getNext();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> l1 = new SinglyLinkedList<Integer>();
		SinglyLinkedList<Integer> l2 = new SinglyLinkedList<Integer>();
		int N = 5;
		int X = 10;

		for(int i = 0; i < N; i++) {
			l1.add((int) (Math.random()*X));
		}
		System.out.println(l1.toString());
		Node<Integer> cur = l1.getHead();
		while(cur.hasNext()) {
			cur = cur.getNext();
		}
		cur.setNext(l1.getHead());
		System.out.println(loopDetection(l1).toString());
		cur.setNext(l1.getHead().getNext());
		System.out.println(loopDetection(l1).toString());
		cur.setNext(l1.getHead().getNext().getNext());
		System.out.println(loopDetection(l1).toString());
		cur.setNext(l1.getHead().getNext().getNext().getNext());
		System.out.println(loopDetection(l1).toString());
		cur.setNext(l1.getHead().getNext().getNext().getNext().getNext());
		System.out.println(loopDetection(l1).toString());
	}
}