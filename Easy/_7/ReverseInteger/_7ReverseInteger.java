package _7.ReverseInteger;

public class _7ReverseInteger {

	public int reverseInteger(int n) {
		int reversed_n = 0;

		while (n != 0) {
			int temp = reversed_n * 10 + n % 10;
			n = n / 10;
			if (temp / 10 != reversed_n) {
				reversed_n = 0;
				break;
			}
			reversed_n = temp;
		}
		return reversed_n;
	}

	public int reverse1(int x) {
		String str = x + "";
		if (str.length() == 1) {
			return x;
		}
		int[] a = new int[str.length()];
		System.out.println(str.length());
		for (int i = str.length() - 1; i > 0; i--) {
			a[i] = x % (int) (Math.pow(10, i));
			x = x - a[i] * (int) (Math.pow(10, i));
		}
		return 0;
	}

	public int reverse(int x) {
		String str = x + "";
		String strX = "";
		if (str.length() == 1)
			return x;
		if (str.charAt(0) != '-')
			for (int i = str.length() - 1; i >= 0; i--)
				strX += str.charAt(i);
		else {
			strX = str.charAt(0) + "";
			for (int i = str.length() - 1; i > 0; i--)
				strX += str.charAt(i);
		}
		return Integer.valueOf(strX);
	}

	public int reverse3(int x) {
		int reverseNum = 0;
		int temp = 0;
		while (x != 0) {
			temp = reverseNum * 10 + x % 10;
			x = x / 10;
			if (temp / 10 != reverseNum) {
				reverseNum = 0;
				break;
			}
			reverseNum = temp;
		}
		return reverseNum;
	}
	
	public boolean reverse4(int x) {
		int m = x;
		int reverseNum = 0;
		int temp = 0;
		while (x != 0) {
			temp = reverseNum * 10 + x % 10;
			x = x / 10;
			if (temp / 10 != reverseNum) {
				reverseNum = 0;
				break;
			}
			reverseNum = temp;
		}
		if (m == reverseNum)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		// System.out.println(new _7ReverseInteger().reverse(-123));
		System.out.println(new _7ReverseInteger().reverse3(-2147447412));
		System.out.println(new _7ReverseInteger().reverse4(-2147447412));
	}
}
