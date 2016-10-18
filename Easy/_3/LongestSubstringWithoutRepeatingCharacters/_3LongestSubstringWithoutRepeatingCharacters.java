package _3.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class _3LongestSubstringWithoutRepeatingCharacters {

	/**
	 * int[26] for Letters 'a' - 'z' or 'A' - 'Z'
	   int[128] for ASCII
	   int[256] for Extended ASCII
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
	
	public int lengthOfLongestSubstring1(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		HashSet<Character> set = new HashSet<Character>();

		int leftPosition = 0, max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				while (leftPosition < i
						&& s.charAt(leftPosition) != s.charAt(i)) {
					set.remove(s.charAt(leftPosition));
					leftPosition++;
				}
				leftPosition++;
			} else {
				set.add(s.charAt(i));
				max = Math.max(max, i - leftPosition + 1);
			}
		}
		return max;

	}

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		HashSet<Character> set = new HashSet<Character>();

		int leftBound = 0, max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				while (leftBound < i && s.charAt(leftBound) != s.charAt(i)) {
					set.remove(s.charAt(leftBound));
					leftBound++;
				}
				leftBound++;
			} else {
				set.add(s.charAt(i));
				max = Math.max(max, i - leftBound + 1);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2("abcabca"));
	}
}
