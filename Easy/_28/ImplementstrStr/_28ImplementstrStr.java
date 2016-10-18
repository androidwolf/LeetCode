package _28.ImplementstrStr;

public class _28ImplementstrStr {

	public int strStr2(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j = 0;
			for (; j < needle.length(); j++)
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;
			if (j == needle.length())
				return i;
		}
		return -1;
	}

	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return -1;
		}

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j = 0;
			for (j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			// finished loop, target found
			if (j == needle.length()) {
				return i;
			}
		}
		return -1;
	}

	public int strStr1(String source, String target) {
		if (source == null || target == null) {
			return -1;
		}

		for (int i = 0; i < source.length() - target.length() + 1; i++) {
			int j = 0;
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i + j) != target.charAt(j)) {
					break;
				}
			}
			// finished loop, target found
			if (j == target.length()) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	}
}
