package _13.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class _13RomantoInteger {

	public int romanToInt(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int length = s.length();
		int result = m.get(s.charAt(length - 1));
		for (int i = length - 2; i >= 0; i--) {
			if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
				result += m.get(s.charAt(i));
			} else {
				result -= m.get(s.charAt(i));
			}
		}
		return result;
	}

	public int romanToInt1(String s) {
		int ret = toNumber(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (toNumber(s.charAt(i-1)) < toNumber(s.charAt(i))) {
				ret += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i-1));
			} else {
				ret += toNumber(s.charAt(i));
			}
		}
		return ret;
	}

	int toNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new _13RomantoInteger().romanToInt1("DCXXI"));
	}
}
