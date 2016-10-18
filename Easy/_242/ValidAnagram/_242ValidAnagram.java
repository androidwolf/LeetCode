package _242.ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _242ValidAnagram {

	public boolean isAnagram1(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (s.length() == 0 && t.length() == 0)
			return true;
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		for (int i = 0; i < tt.length; i++) {
			if (ss[i] != tt[i])
				return false;
		}
		return true;
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (s.length() == 0 && t.length() == 0)
			return true;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			if (!map1.containsKey(t.charAt(i)))
				map1.put(t.charAt(i), 1);
			map1.put(t.charAt(i), map1.get(t.charAt(i)) + 1);
		}
		if (map.equals(map1))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String s = "aabab";
		String t = "ababa";
		System.out.println(new _242ValidAnagram().isAnagram1(s, t));
	}
}
