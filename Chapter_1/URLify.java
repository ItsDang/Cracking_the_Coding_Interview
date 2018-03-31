class URLify {
	public static char[] URLify(char[] str, int trueLength) {
		// to do inplace go backwards
		int cur = str.length - 1;
		for(int i = trueLength - 1; i > -1; i--) {
			if(str[i] == ' ') {
				str[cur] = '0';
				str[cur-1] = '2';
				str[cur-2] = '%';
				cur = cur - 3;
			} else {
				str[cur] = str[i];
				cur = cur - 1;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String[] strs = {"Mr John Smith    "};
		int[] trueLengths = {13};
		for(int i = 0; i < strs.length; i++) {
			System.out.println(new String(URLify(strs[i].toCharArray(), trueLengths[i])));
		}
	}
}