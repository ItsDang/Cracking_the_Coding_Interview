// Find the first >= x then find the first after that < x swap and continue.

class Partition {
	public static void partition(SinglyLinkedList<Integer> list, int x) {
		Node<Integer> greaterOrEqual = list.getHead();
		while(greaterOrEqual != null) {
			if(greaterOrEqual.getValue() >= x) {
				Node<Integer> less = greaterOrEqual.getNext();
				while(less != null) {
					if(less.getValue() < x) {
						int temp = greaterOrEqual.getValue();
						greaterOrEqual.setValue(less.getValue());
						less.setValue(temp);
						break;
					}
					less = less.getNext();
				}
			}
			greaterOrEqual = greaterOrEqual.getNext();
		}
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
		int x = (int) (Math.random()*X);
		System.out.println("Partition on " + x);
		partition(list, x);
		System.out.println(list.toString());
	}
}