package _8.StringtoInteger;

public class _8StringtoInteger {

	public int myAtoi1(String str) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (str == null) {
			return 0;
		}
		str = str.trim();
		if (str.length() == 0) {
			return 0;
		}

		int sign = 1;
		int index = 0;

		if (str.charAt(index) == '+') {
			index++;
		} else if (str.charAt(index) == '-') {
			sign = -1;
			index++;
		}
		long num = 0;
		for (; index < str.length(); index++) {
			if (str.charAt(index) < '0' || str.charAt(index) > '9')
				break;
			num = num * 10 + (str.charAt(index) - '0');
			if (num > Integer.MAX_VALUE) {
				break;
			}
		}
		if (num * sign >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (num * sign <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) num * sign;
	}

	public int myAtoi(String str) {
		if (str == null || str.length() == 0)
			return 0;
		str = str.trim();
		if (str.matches("([0-9]|-|\\+)[0-9]*")) {
			if (str.charAt(0) == '+') {
				if (str.length() > 11
						|| str.length() == 1
						|| (str.length() == 11 && !str
								.matches("[+][1-2][0-1][0-4][0-7][0-4][0-8][0-3][0-6][0-4][0-7]")))
					return 0;
				else
					return Integer.parseInt(str);
			}
			if (str.charAt(0) == '-') {
				if (str.length() > 11
						|| str.length() == 1
						|| (str.length() == 11 && !str
								.matches("[-][1-2][0-1][0-4][0-7][0-4][0-8][0-3][0-6][0-4][0-8]"))) {
					return 0;
				} else {
					return Integer.parseInt(str);
				}
			}
			if ((str.charAt(0) + "").matches("[0-9]")) {
				if (str.length() > 10
						|| (str.length() == 10 && !str
								.matches("[1-2][0-1][0-4][0-7][0-4][0-8][0-3][0-6][0-4][0-7]")))
					return 0;
				else
					return Integer.parseInt(str);
			}
		}
		return 0;
	}

	public int myAtoi2(String str) {
		if (str == null)
			return 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;
		int index = 0;
		int sign = 1;
		if (str.charAt(index) == '+') {
			sign = -1;
			index++;
		} else if (str.charAt(index) == '-')
			index++;
		long num = 0;
		for (; index < str.length(); index++) {
			System.out.println(str.charAt(index));
			if (str.charAt(index) < '0' || str.charAt(index) > '9')
				break;
			num = num * 10 + (str.charAt(index) - '0');
			if (num > Integer.MAX_VALUE)
				break;
		}
		if (num * sign >= Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (num * sign <= Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) num * sign;
	}

	public int myAtoi3(String str) {
		if (str == null)
			return 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;
		int flag = 1;
		int index = 0;
		if (str.matches("([0-9]|-|\\+)[0-9]*")) {
			if (str.charAt(index) == '+')
				index++;
			else if (str.charAt(index) == '-') {
				flag = -1;
				index++;
			}
			while (str.charAt(index++) < '0' || str.charAt(index++) > '9')
				break;
			return Integer.parseInt(str.substring(0, index));
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new _8StringtoInteger().myAtoi2("+00131204"));
	}
}
