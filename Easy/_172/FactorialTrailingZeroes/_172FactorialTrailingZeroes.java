package _172.FactorialTrailingZeroes;

public class _172FactorialTrailingZeroes {

	public int trailingZeroes1(int n) {
		if (n < 1)
			return 0;
		int total = 0;
		while (n / 5 != 0) {
			n = n / 5;
			total += n;
		}
		return total;
	}

	public int trailingZeroes(int n) {
		if (n == 0)
			return 0;
		double sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
		String str = String.valueOf(sum);
		System.out.println(str);
		String[] strs = str.split("0");
		return strs.length - 1;
	}

	public static void main(String[] args) {
		System.out
				.println(new _172FactorialTrailingZeroes().trailingZeroes1(14));
	}
}
