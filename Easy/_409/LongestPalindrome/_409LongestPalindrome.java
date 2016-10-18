package _409.LongestPalindrome;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _409LongestPalindrome {

	public int longestPalindrome1(String s) {
		Set<Character> set = new HashSet<Character>();
		int count = 0;
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				set.remove(c);
				count += 2;
			} else {
				set.add(c);
			}
		}
		return count + (set.size() > 0 ? 1 : 0);
	}

	public int longestPalindrome(String s) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++)
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			else
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		boolean flag = false;
		for (Character c : map.keySet()) {
			int temp = map.get(c);
			if (temp % 2 == 0)
				count += map.get(c);
			if (temp % 2 != 0) {
				flag = true;
				while (temp - 2 > 0) {
					count += 2;
					temp = temp - 2;
				}
			}
		}
		if (flag)
			count++;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(new _409LongestPalindrome()
				.longestPalindrome("aaabaaaa"));
		System.out.println(new _409LongestPalindrome()
		.longestPalindrome1("aaabaaaa"));
	}
}
