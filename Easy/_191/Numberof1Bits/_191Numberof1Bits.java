package _191.Numberof1Bits;

public class _191Numberof1Bits {

	public int hammingWeight4(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 0x1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public int hammingWeight3(int n) {
		int res = 0;
		while (n != 0) {
			res += n & 1;
			n >>>= 1;
		}
		return res;
	}

	public int hammingWeight2(int n) {
		if (n == 0)
			return 0;
		int count = 1;
		while ((n & (n - 1)) != 0) {
			n &= n - 1;
			count++;
		}
		return count;
	}

	public int hammingWeight1(int n) {
		int count = 0;
		while (n != 0) {
			if ((n | 1) == n) {
				count++;
				n = n >> 1;
			} else
				n = n >> 1;
		}
		return count;
	}

	public int hammingWeight(int n) {
		String str = intToBinary(n);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		return count;
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
		int a = 1; // 4294967295;
		// System.out.println(Integer.MAX_VALUE);
		System.out.println(new _191Numberof1Bits().hammingWeight3(8));
	}
}
