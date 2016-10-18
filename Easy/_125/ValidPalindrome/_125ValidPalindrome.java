package _125.ValidPalindrome;

public class _125ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s.length() == 0)
			return true;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j
					&& !((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
							|| (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s
							.charAt(i) >= '0' && s.charAt(i) <= '9')))
				i++;
			while (i < j
					&& !((s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
							|| (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s
							.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				System.out.println("--" + j);
				j--;
			}
			if (!(s.charAt(i) + "").equalsIgnoreCase(s.charAt(j) + "")) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public boolean isPalindrome1(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}

		int front = 0;
		int end = s.length() - 1;
		while (front < end) {
			while (front < s.length() && !isvalid(s.charAt(front))) { // nead to
																		// check
																		// range
																		// of
																		// a/b
				front++;
			}

			if (front == s.length()) { // for emtpy string ¡°.,,,¡±
				return true;
			}

			while (end >= 0 && !isvalid(s.charAt(end))) { // same here, need to
															// check border of
															// a,b
				end--;
			}

			if (Character.toLowerCase(s.charAt(front)) != Character
					.toLowerCase(s.charAt(end))) {
				break;
			} else {
				front++;
				end--;
			}
		}

		return end <= front;
	}

	private boolean isvalid(char c) {
		return Character.isLetter(c) || Character.isDigit(c);
	}

	public static void main(String[] args) {
		System.out.println(new _125ValidPalindrome().isPalindrome(".p"));
	}
}
