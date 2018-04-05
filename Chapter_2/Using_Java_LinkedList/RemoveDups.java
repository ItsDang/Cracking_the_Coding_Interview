import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
class RemoveDups {
	public static void removeDups(LinkedList<Integer> list) {
		HashSet<Integer> uniq = new HashSet<Integer>();
		ListIterator<Integer> l = list.listIterator();
		while(l.hasNext()) {
			int value = l.next();
			if(uniq.contains(value)) {
				l.remove();
			} else {
				uniq.add(value);
			}
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int N = 10;
		for(int i = 0; i < N; i++) {
			list.add((int) (Math.random()*10.0));
		}
		ListIterator<Integer> l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
		System.out.println("After removed duplicates");
		removeDups(list);
		l = list.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next() + " ");
		}
 	}
}