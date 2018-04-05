class Palindrome {
	// abcba, length is 6
	// ^ needs to go 5, length - 1
	//  ^ needs to go 2, length - 1 - (2*i)
	public static boolean palindrome(SinglyLinkedList<Integer> list) {
		Node<Integer> cur = list.getHead();
		int length = list.length();
		System.out.println(length);
		for(int i = 0; i < length/2; i++) {
			System.out.println(i);
			Node<Integer> next = cur;
			for(int j = 0; j < length - 1 - (2 * i); j++) {
				System.out.println(j);
				next = next.getNext();
			}
			if(next.getValue() != cur.getValue()) {
				return false;
			}
			cur = cur.getNext();
		}
		return true;
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		int N = 5;
		int X = 10;

		for(int i = 0; i < N; i++) {
			list.add((int) (Math.random()*X));
		}
		if(palindrome(list)) {
			System.out.println(list.toString() + " is a palindrome.");
		} else {
			System.out.println(list.toString() + " isn't a palindrome.");
		}

		SinglyLinkedList<Integer> l1 = new SinglyLinkedList<Integer>();
		if(palindrome(l1)) {
			System.out.println(l1.toString() + " is a palindrome.");
		} else {
			System.out.println(l1.toString() + " isn't a palindrome.");
		}
		l1.add(1);
		if(palindrome(l1)) {
			System.out.println(l1.toString() + " is a palindrome.");
		} else {
			System.out.println(l1.toString() + " isn't a palindrome.");
		}
		l1.add(2);
		if(palindrome(l1)) {
			System.out.println(l1.toString() + " is a palindrome.");
		} else {
			System.out.println(l1.toString() + " isn't a palindrome.");
		}
		l1.add(2);
		if(palindrome(l1)) {
			System.out.println(l1.toString() + " is a palindrome.");
		} else {
			System.out.println(l1.toString() + " isn't a palindrome.");
		}
		l1.add(1);
		if(palindrome(l1)) {
			System.out.println(l1.toString() + " is a palindrome.");
		} else {
			System.out.println(l1.toString() + " isn't a palindrome.");
		}
	}
}