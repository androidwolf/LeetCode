package _67.AddBinary;

public class _67AddBinary {

	public String addBinary(String a, String b) {
		if ((a.length() == 0 || a.isEmpty())
				&& (b.length() == 0 || b.isEmpty()))
			return null;
		if (a.length() == 0 || a.isEmpty())
			return b;
		if (b.length() == 0 || b.isEmpty())
			return a;
		int i = a.length() - 1, j = b.length() - 1, sum, m = 0;
		int[] temp = new int[Math.max(a.length(), b.length()) + 1];
		int k = temp.length;
		while (i >= 0 && j >= 0) {
			sum = a.charAt(i) - '0' + b.charAt(j) - '0' + m;
			temp[--k] = sum % 2;
			m = sum / 2;
			i--;
			j--;
		}
		while (i >= 0) {
			sum = a.charAt(i) - '0' + m;
			temp[--k] = sum % 2;
			m = sum / 2;
			i--;
		}
		while (j >= 0) {
			sum = b.charAt(j) - '0' + m;
			temp[--k] = sum % 2;
			m = sum / 2;
			j--;
		}
		if (m == 1)
			temp[0] = 1;
		String str = "";
		for (int l = 0; l < temp.length; l++) {
			if (l == 0 && temp[l] == 0)
				continue;
			str = str.concat(Integer.toBinaryString(temp[l]));
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(new _67AddBinary().addBinary("1", "11"));
	}
}
