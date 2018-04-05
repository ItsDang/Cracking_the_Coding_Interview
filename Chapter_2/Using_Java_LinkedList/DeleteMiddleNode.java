import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
class DeleteMiddleNode {
	// Problem says only access to middle node, but not possible to create seperate running after middle
	// without shifting the middle ListIterator.
	// Substituion instead of having 1 node as mid, and then creating midnext as mid.next;
	public static void deleteMiddleNode(ListIterator<Integer> mid, ListIterator<Integer> midnext) {
		while(midnext.hasNext()) {
			mid.next();
			mid.set(midnext.next());
		}
		mid.remove();
	}
	public static void main(String[] args) {
		// Generate a list of length N.
		LinkedList<Integer> list = new LinkedList<Integer>();
		int N = 10;
		for(int i = 0; i < N; i++) {
			list.add((int) (Math.random()*10.0));
		}
		// Print out list.
		ListIterator<Integer> l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
		System.out.println("After deleted middle node.");
		int middle = ((int) (Math.random() * (list.size() - 2))) + 1;
		System.out.println("Middle index is " + middle);
		for(int i = 0; i < middle; i++ ){
			System.out.print("  ");
		}
		System.out.print("^\n");
		ListIterator<Integer> mid = list.listIterator(middle);
		ListIterator<Integer> midnext = list.listIterator(middle + 1);
		deleteMiddleNode(mid, midnext);
		// Print out list after modification.
		l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
 	}
}