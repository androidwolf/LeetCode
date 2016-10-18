package _66.PlusOne;

public class _66PlusOne {

	public int[] plusOne(int[] digits) {
		int flag = 1, sum;
		for (int i = digits.length - 1; i >= 0; i--) {
			sum = digits[i] + flag;
			digits[i] = sum % 10;
			flag = sum / 10;
		}
		// 如果还有进位，我们就得在数组最前面加一个了
		if (flag == 1) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			return newDigits;
		}
		return digits;
	}

	public int[] plusOne1(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--)
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		int[] newDigits = new int[digits.length + 1];
		newDigits[0] = 1;
		for (int i = 0; i < digits.length; i++) {
			newDigits[i + 1] = digits[i];
		}
		return digits;
	}

	public static void main(String[] args) {
		int[] a = {};
		new _66PlusOne().plusOne(a);
	}
}
