package _344.ReverseString;

import java.util.Stack;

public class _344ReverseString {

	//≥¨ ±¡À
	public String reverseString1(String s) {
		Stack<Character> stack = new Stack<Character>();
		String str = "";
		for (int i = 0; i < s.length(); i++)
			stack.add(s.charAt(i));
		while(!stack.isEmpty())
			str += stack.pop();
		return str;
	}

	public String reverseString(String s) {
		char[] ss = s.toCharArray();
		int j = ss.length - 1, i = 0;
		char temp;
		while (i < j) {
			temp = ss[i];
			ss[i] = ss[j];
			ss[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ss);
	}

	public static void main(String[] args) {
		System.out.println(new _344ReverseString().reverseString1("hello"));
	}
}
