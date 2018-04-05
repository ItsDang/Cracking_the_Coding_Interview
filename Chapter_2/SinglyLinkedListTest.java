class SinglyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("Testing Singly Linked List class.");
		// Testing constructors.
		System.out.println("Testing constructors.");
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		System.out.println(list.toString());

		// Testing basic insert.
		System.out.println("Testing basic insert.");
		for(int i = 0; i < 10; i++) {
			list.insert(i);
			System.out.println(list.toString());
		}

		// Testing basic remove.
		System.out.println("Testing basic remove.");
		for(int i = 0; i < 10; i++) {
			list.remove();
			System.out.println(list.toString());
		}

		// Testing indexed remove.
		System.out.println("Testing indexed remove.");
		for(int i = 0; i < 10; i++) {
			list.insert(i);
			System.out.println(list.toString());
		}
		list.removeFrom(0);
		System.out.println(list.toString());
		list.removeFrom(1);
		System.out.println(list.toString());
		list.removeFrom(-1);
		System.out.println(list.toString());
		list.removeFrom(2);
		System.out.println(list.toString());
		list.removeFrom(100);
		System.out.println(list.toString());
		list.removeFrom(6);
		System.out.println(list.toString());

		
		list.remove(6);
		System.out.println(list.toString());
		list.remove(1);
		System.out.println(list.toString());
	}
}