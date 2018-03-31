class StringCompression {
	public static String stringCompression(String str) {
		StringBuilder compressed = new StringBuilder();
		char cur = str.charAt(0);
		int len = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == cur) {
				len = len + 1;
			} else {
				compressed.append(cur);
				compressed.append(Character.forDigit(len, 10));
				cur = str.charAt(i);
				len = 1;
			}
		}
		compressed.append(cur);
		compressed.append(len);
		if(compressed.length() < str.length()) {
			return compressed.toString();
		} else {
			return str;
		}
	}
	public static void main(String[] args) {
		String[] strs = {"aabcccccaaa", "tacocat", "ttaacco", "a", "ab", "abb"};
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i] + " compressed version is " + stringCompression(strs[i]));
		}
	}
}