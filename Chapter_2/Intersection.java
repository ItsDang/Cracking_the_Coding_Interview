import java.util.HashSet;
class Intersection {
	public static boolean intersection(SinglyLinkedList<Integer> l1, SinglyLinkedList<Integer> l2) {
		HashSet<Node<Integer>> seen = new HashSet<Node<Integer>>();
		Node<Integer> cur = l1.getHead();
		while(cur != null) {
			seen.add(cur);
			cur = cur.getNext();
		}
		cur = l2.getHead();
		while(cur != null) {
			if(seen.contains(cur)) {
				return true;
			}
			cur = cur.getNext();
		}
		return false;
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
		for(int i = 0; i < N; i++) {
			l2.add((int) (Math.random()*X));
		}
		System.out.println(l2.toString());
		System.out.println(intersection(l1, l1));
		System.out.println(intersection(l2, l2));
		System.out.println(intersection(l1, l2));
		l2.setHead(l1.getHead().getNext());
		System.out.println(intersection(l1, l2));
	}
}