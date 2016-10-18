package _290.WordPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _290WordPattern {

	public boolean wordPattern1(String pattern, String str) {
		String[] strs = str.split(" ");
		if (pattern.length() != strs.length)
			return false;

		Map<Character, String> map = new HashMap<Character, String>();
		Set<String> unique = new HashSet<String>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			if (map.containsKey(c)) {
				if (!map.get(c).equals(strs[i]))
					return false;
			} else {
				if (unique.contains(strs[i]))
					return false;
				map.put(c, strs[i]);
				unique.add(strs[i]);
			}
		}
		return true;
	}

	public boolean wordPattern(String pattern, String str) {
		String[] strs = str.split(" ");
		if (pattern.length() != strs.length)
			return false;
		Map<String, Character> map = new HashMap<String, Character>();
		String temp = "";
		char c = 'a';
		for (int i = 0; i < strs.length; i++) {
			if (!map.containsKey(strs[i]))
				map.put(strs[i], c++);
			temp = temp + map.get(strs[i]);
		}
		return temp.equals(transformPattern(pattern));
	}

	public String transformPattern(String s) {
		char c = 'a';
		String temp = "";
		char[] chs = s.toCharArray();
		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(chs[i]))
				map.put(chs[i], c++);
			temp = temp + map.get(chs[i]);
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(new _290WordPattern().wordPattern("atpp",
				"t s hub hub"));
	}
}
