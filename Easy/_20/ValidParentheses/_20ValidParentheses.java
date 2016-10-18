package _20.ValidParentheses;

public class _20ValidParentheses {

	public boolean isValid(String s) {
		if (s.length() % 2 != 0)
			return false;
		char[] characters = new char[s.length()];
		int index = 0, i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				characters[index++] = s.charAt(i);
			if (s.charAt(i) == '[')
				characters[index++] = s.charAt(i);
			if (s.charAt(i) == '{') {
				characters[index++] = s.charAt(i);
				System.out.println(index);
			}

			if (s.charAt(i) == ')') {
				if (--index < 0 || characters[index] != '(')
					break;
				System.out.println(index + "  " + characters[index]);
			}
			if (s.charAt(i) == ']') {
				if (--index < 0 || characters[index] != '[')
					break;
				System.out.println(index + "  " + characters[index]);
			}
			if (s.charAt(i) == '}') {
				if (--index < 0 || characters[index] != '{')
					break;
				System.out.println(index + "  " + characters[index]);
			}
		}
		if (i == s.length() && index == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new _20ValidParentheses().isValid("{}[]()"));
	}
}
