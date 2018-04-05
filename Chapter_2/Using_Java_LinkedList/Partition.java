import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
class Partition {
	// Problem says only access to middle node, but not possible to create seperate running after middle
	// without shifting the middle ListIterator.
	public static void partition(LinkedList<Integer> list, int x) {
		ListIterator<Integer> greaterOrEqual = list.listIterator();
		// ListIterator<Integer> less = list.listIterator();
		while(greaterOrEqual.hasNext()) {
			int value = greaterOrEqual.next();
			if(value >= x) {
				 
			}
		}
		// 
	}
	public static void main(String[] args) {
		// Generate a list of length N.
		LinkedList<Integer> list = new LinkedList<Integer>();
		int N = 10;
		int X = 10;
		for(int i = 0; i < N; i++) {
			list.add((int) (Math.random()*X));
		}
		// Print out list.
		ListIterator<Integer> l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
		int x = ((int) (Math.random() * X);
		System.out.println("After partition around " + x);
		partition(list, x);
		// Print out list after modification.
		l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
 	}
}