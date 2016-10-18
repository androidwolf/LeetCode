package _415.AddStrings;

public class _415AddStrings {

	public String addStrings1(String num1, String num2) {
		StringBuffer sb = new StringBuffer();
		int l1 = num1.length();
		int l2 = num2.length();
		char[] c1 = num1.toCharArray();
		char[] c2 = num2.toCharArray();
		int carry = 0;
		for (int i = 0; i < l1 || i < l2; i++) {
			int a1 = i < l1 ? c1[l1 - 1 - i] - 48 : 0;
			int a2 = i < l2 ? c2[l2 - 1 - i] - 48 : 0;
			int ans = a1 + a2 + carry;
			sb.append(ans % 10);
			carry = ans / 10;
		}
		if (carry == 1) {
			sb.append("1");
		}
		return sb.reverse().toString();
	}

	public String addStrings(String num1, String num2) {
		char[] num1s = num1.toCharArray();
		char[] num2s = num2.toCharArray();
		int flag = 0, temp = 0, len1 = num1s.length - 1, len2 = num2s.length - 1;
		String result = "";
		int i = len1, j = len2;
		for (; i >= 0 && j >= 0; i--, j--) {
			temp = num1s[i] - '0' + num2s[j] - '0' + flag;
			if (temp > 9) {
				flag = 1;
				temp = temp % 10;
			} else
				flag = 0;
			result = temp + result;
		}
		while (i >= 0) {
			temp = num1s[i] - '0' + flag;
			if (temp > 9) {
				flag = 1;
				temp = temp % 10;
			} else
				flag = 0;
			result = temp + result;
			i--;
		}
		while (j >= 0) {
			temp = num2s[j] - '0' + flag;
			if (temp > 9) {
				flag = 1;
				temp = temp % 10;
			} else
				flag = 0;
			result = temp + result;
			j--;
		}
		if (flag == 1)
			result = flag + result;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new _415AddStrings().addStrings("1238", "13218"));
	}
}
