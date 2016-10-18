package _205.IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _205IsomorphicStrings {

	public boolean isIsomorphic2(String s, String t) {
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		Map<Character, Character> map = new HashMap<Character, Character>();
		Set<Character> set = new HashSet<Character>();
		char c1, c2;
		for (int i = 0; i < s.length(); i++) {
			c1 = s.charAt(i);
			c2 = t.charAt(i);
			
			if (map.containsKey(c1)) {
				if (map.get(c1) != c2)
					return false;
			} else {
				if (set.contains(c2)) 
					return false;
				else {
					map.put(c1, c2);
					set.add(c2);
				}
			}
		}
		return true;
	}

	public boolean isIsomorphic1(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (transferStr(s).equals(transferStr(t)))
			return true;
		return false;
	}

	public String transferStr(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String str = "", strTemp = "";
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			strTemp = s.charAt(i) + "";
			if (!map.containsKey(strTemp)) {
				map.put(s.charAt(i) + "", temp++);
			}
			str = str + map.get(strTemp);
		}
		return str;
	}

	public boolean isIsomorphic(String s, String t) {
		if (s.length() == 0 && t.length() == 0)
			return true;
		if (s.length() != t.length())
			return false;
		int len = s.length();
		for (int i = 0; i < len - 1; i++) {
			if ((s.charAt(i) == s.charAt(i + 1) && t.charAt(i) == t
					.charAt(i + 1))
					|| (s.charAt(i) != s.charAt(i + 1) && t.charAt(i) != t
							.charAt(i + 1)))
				continue;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		String t = "\"bcdgfg";
		System.out.println(new _205IsomorphicStrings().isIsomorphic(s, t));
		System.out.println(new _205IsomorphicStrings().isIsomorphic1(s, t));
		System.out.println(new _205IsomorphicStrings().transferStr(s));
		System.out.println(new _205IsomorphicStrings().transferStr(t));
	}
}
