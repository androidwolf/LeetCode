package _14.LongestCommonPrefix;

public class _14LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			while (j < prefix.length() && j < strs[i].length()
					&& prefix.charAt(j) == strs[i].charAt(j)) {
				j++;
			}
			if (j == 0) {
				return "";
			}
			prefix = prefix.substring(0, j);
		}
		return prefix;
	}

	public String longestCommonPrefix1(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

	public static void main(String[] args) {
		String[] strs = { "asdaaaa", "as", "ad", "asfsdf" };
		System.out.println(new _14LongestCommonPrefix()
				.longestCommonPrefix1(strs));
	}
}
