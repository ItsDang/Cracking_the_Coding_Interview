import java.lang.Math;

class OneAway {
	public static boolean oneAway(String str1, String str2) {
		String s1 = str1;
		String s2 = str2;
		int l1 = str1.length();
		int l2 = str2.length();
		// making the 1st one the shorter string.
		if(l1 > l2) {
			s1 = str2;
			s2 = str1;
			l1 = str2.length();
			l2 = str1.length();
		}
		// System.out.println(s1 + l1);
		// System.out.println(s2 + l2);
		int ldelta = Math.abs(l1-l2);
		if(ldelta > 1) {
			return false;
		} else {
			// System.out.println("Passed Delta Test.");
			int i1 = 0;
			int i2 = 0;
			boolean dif = false;
			while(i1 < l1 && i2 < l2) {
				// System.out.println(i1 + " " + i2);
				if(s1.charAt(i1) != s2.charAt(i2)) {
					if(!dif) {
						dif = true;
						if(ldelta == 0){
							i1 = i1 + 1;
						}
						i2 = i2 + 1;
					} else {
						return false;
					}
				} else {
					i1 = i1 + 1;
					i2 = i2 + 1;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		String[] str1s = {"pale", "pales", "pale", "pale", "a", "ab"};
		String[] str2s = {"ple", "pale", "bale", "bake", "", ""};
		for(int i = 0; i < str1s.length; i++) {
			if(oneAway(str1s[i], str2s[i])) {
				System.out.println(str1s[i] + " is one away from " + str2s[i]);
			} else {
				System.out.println(str1s[i] + " isn't one away from " + str2s[i]);
			}
		}
	}
}