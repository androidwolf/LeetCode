package _6.ZigZagConversion;

public class _3ZigZagConversion {

	public String convert1(String s, int nRows) {
		int length = s.length();
		if (length <= nRows || nRows == 1)
			return s;
		char[] chars = new char[length];
		int step = 2 * (nRows - 1);
		int count = 0;
		for (int i = 0; i < nRows; i++) {
			int interval = step - 2 * i;    //¼ä¸ô
			for (int j = i; j < length; j += step) {
				chars[count] = s.charAt(j);
				count++;
				if (interval < step && interval > 0 && j + interval < length
						&& count < length) {
					chars[count] = s.charAt(j + interval);
					count++;
				}
			}
		}
		return new String(chars);
	}

	public String convert(String s, int numRows) {
		if (s == null || s.length() == 0) {
			return null;
		}
		if (numRows == 1 || s.length() == 1) {
			return s;
		}
		String str = null;
		char[][] c = new char[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numRows; j++) {
				c[i][j] = 0;
			}
		}
		int p = 0;
		for (int i = 0; p < s.length(); i += 2) {
			for (int j = 0; j < numRows * 2 - 1; j++) {
				if (j < numRows) {
					c[j][i] = s.charAt(p++);
				} else {
					if (j % numRows != 0) {
						c[numRows - 1 - (j % numRows)][i + 1] = s.charAt(p++);
					}
				}
			}
		}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numRows; j++) {
				if (c[i][j] != 0) {
					str += c[i][j];
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(new _3ZigZagConversion().convert1("\"\"", 3));
	}
}
