package _387.FirstUniqueCharacterinaString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _387FirstUniqueCharacterinaString {

	 public int firstUniqChar3(String s) {  
	        char[] cs=s.toCharArray();  
	        List<Character> list=new ArrayList<Character>();  
	        Map<Character,Integer> map=new HashMap<Character,Integer>();  
	        for (int i = 0; i < cs.length; i++) {  
	            Character c=cs[i];  
	            if (map.containsKey(c)) {  
	                list.remove(c);  
	            }else{  
	                list.add(c);  
	                map.put(c,i);  
	            }  
	        }  
	        return list.size()==0?-1:map.get(list.get(0));  
	    }  
	
	public int firstUniqChar2(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c) + 1);
			} else {
				hashmap.put(c, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hashmap.get(c) == 1) {
				return i;
			}
		}
		return -1;
	}

	public int firstUniqChar1(String s) {
		if (s == null || s.length() == 0)
			return -1;
		int[] count = new int[256];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			count[index]++;
		}

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (count[index] == 1)
				return i;
		}
		return -1;
	}

	// ³¬Ê±ÁË
	public int firstUniqChar(String s) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++)
			list.add(s.charAt(i));
		for (int i = 0; i < s.length(); i++) {
			list.remove((Character) s.charAt(i));
			if (!list.contains(s.charAt(i)))
				return i;
			list.add(s.charAt(i));
		}
		return -1;
	}

	public static void main(String[] args) {
	}
}
