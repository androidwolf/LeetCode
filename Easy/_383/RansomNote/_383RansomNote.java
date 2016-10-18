package _383.RansomNote;

import java.util.HashMap;
import java.util.Map;

public class _383RansomNote {

	public boolean canConstruct1(String ransomNote, String magazine) {
		int[] arr = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> mapRan = new HashMap<Character, Integer>();
		Map<Character, Integer> mapMag = new HashMap<Character, Integer>();

		for (int i = 0; i < ransomNote.length(); i++)
			if (!mapRan.containsKey(ransomNote.charAt(i)))
				mapRan.put(ransomNote.charAt(i), 1);
			else
				mapRan.put(ransomNote.charAt(i),
						mapRan.get(ransomNote.charAt(i)) + 1);

		for (int i = 0; i < magazine.length(); i++)
			if (!mapMag.containsKey(magazine.charAt(i)))
				mapMag.put(magazine.charAt(i), 1);
			else
				mapMag.put(magazine.charAt(i),
						mapMag.get(magazine.charAt(i)) + 1);

		for (Character c : mapRan.keySet()) {
			if (!mapMag.containsKey(c) || mapRan.get(c) > mapMag.get(c))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new _383RansomNote().canConstruct("aaabbb",
				"aaaabbc"));
	}
}
