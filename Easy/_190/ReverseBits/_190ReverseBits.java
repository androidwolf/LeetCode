package _190.ReverseBits;

public class _190ReverseBits {

	public int reverseBits1(int n) {
		int reversed = 0;
		for (int i = 0; i < 32; i++) {
			reversed = (reversed << 1) | (n & 1);
			n = (n >> 1);
		}
		return reversed;
	}

	public int reverseBits(int n) {
		String str = intToBinary(n);
		char[] strs = str.toCharArray();
		char temp = ' ';
		int i = 0, j = strs.length - 1;
		while (i < j) {
			temp = strs[i];
			strs[i] = strs[j];
			strs[j] = temp;
			i++;
			j--;
		}
		str = String.valueOf(strs);
		return binaryToInt(str);
	}

	public String intToBinary(int n) {
		String str = "";
		while (n != 0) {
			str = n % 2 + str;
			n = n / 2;
		}
		int len = str.length();
		for (int i = 0; i < 32 - len; i++) {
			str = "0" + str;
		}
		return str;
	}

	public int binaryToInt(String str) {
		int len = str.length() - 1;
		double sum = 0;
		for (int i = 0; i <= len; i++) {
			sum = sum + charToInt(str.charAt(i)) * Math.pow(2, len - i);
		}
		System.out.println(sum + "---" + Integer.MAX_VALUE);
		System.out.println(2147483647 + 1);
		return 0;
	}

	public int charToInt(char c) {
		if (c == '0')
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		// String s = new _190ReverseBits().intToBinary(1);
		// String s1 = new _190ReverseBits().intToBinary(964176192);
		// System.out.println(s);
		// System.out.println(s1);
		System.out.println(new _190ReverseBits().reverseBits1(1));
	}
}
