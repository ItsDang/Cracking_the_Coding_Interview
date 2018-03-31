import java.util.HashMap;
class PalindromePermutation {
	public static boolean palindromePermutation(String str) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			if (count.containsKey(c)) {
				count.replace(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		boolean odd = false;
		for(int v : count.values()) {
			if(v % 2 == 1) {
				if(!odd) {
					odd = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] strs = {"tacocat", "ttaacco", "a", "ab", "abb"};
		for(int i = 0; i < strs.length; i++) {
			if(palindromePermutation(strs[i])) {
				System.out.println(strs[i] + " is a permutation of a palindrome.");
			} else {
				System.out.println(strs[i] + " isn't a permutation of a palindrome.");
			}
		}
	}
}