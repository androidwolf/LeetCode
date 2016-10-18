package _389.FindtheDifference;

import java.util.HashMap;
import java.util.Map;

public class _389FindtheDifference {

	public char findTheDifference1(String s, String t) {
		int[] count = new int[248];
		for (int i = 0; i < s.length(); i++)
			count[s.charAt(i) - 'a']++;
		for (int i = 0; i < t.length(); i++) {
			count[t.charAt(i) - 'a']--;
			if (count[t.charAt(i) - 'a'] < 0)
				return t.charAt(i);
		}
		return ' ';
	}

	public char findTheDifference(String s, String t) {
		Map<Character, Integer> sMap = new HashMap<Character, Integer>();
		Map<Character, Integer> tMap = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			if (i < s.length())
				if (!sMap.containsKey(s.charAt(i)))
					sMap.put(s.charAt(i), 1);
				else
					sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);

			if (!tMap.containsKey(t.charAt(i)))
				tMap.put(t.charAt(i), 1);
			else
				tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
		}
		for (Character c : tMap.keySet()) {
			if (!sMap.containsKey(c))
				return c;
			if (sMap.containsKey(c) && tMap.get(c) > sMap.get(c))
				return c;
		}
		return ' ';
	}

	public static void main(String[] args) {
	}
}
