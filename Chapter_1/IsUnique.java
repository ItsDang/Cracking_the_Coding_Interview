import java.util.HashSet;

class IsUnique {
	public static boolean isUnique(String str) {
		HashSet<Character> count = new HashSet<Character>();
		for(char c: str.toCharArray()) {
			if (count.contains(c)) {
				return false;
			} else {
				count.add(c);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] strs = {"a", "test", "rejected"};
		for(int i = 0; i < strs.length; i++) {
			if(isUnique(strs[i])) {
				System.out.println(strs[i] + " is unique.");
			} else {
				System.out.println(strs[i] + " isn't unique.");
			}
		}
	}
}