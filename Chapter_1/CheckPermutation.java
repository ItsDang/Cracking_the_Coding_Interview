import java.util.HashMap;

class CheckPermutation {
	public static boolean checkPermutation(String str1, String str2) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		// count the number of times a character appears in str1
		for(char c: str1.toCharArray()) {
			if (count.containsKey(c)) {
				count.replace(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		// "count" the number of times a character appears in str2
		for(char c: str2.toCharArray()) {
			if (count.containsKey(c)) {
				count.replace(c, count.get(c) - 1);
			} else {
				count.put(c, -1);
				// return false;
			}
		}
		// check for value != 0 meaning one string has a character the other doesn't have.
		for(int value : count.values()) {
			if(value != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] str1s = {"a", "test", "rejected", "a", "test", "rejected", ""};
		String[] str2s = {"a", "test", "rejected", "b", "tested", "reject", ""};
		for(int i = 0; i < str1s.length; i++) {
			if(checkPermutation(str1s[i], str2s[i])) {
				System.out.println(str1s[i] + " is a permutation of " + str2s[i]);
			} else {
				System.out.println(str1s[i] + " isn't a permutation of " + str2s[i]);
			}
		}
	}
}