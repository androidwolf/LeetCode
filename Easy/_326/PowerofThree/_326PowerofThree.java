package _326.PowerofThree;

public class _326PowerofThree {

	private static final double epsilon = 10e-15;

	public boolean isPowerOfThree1(int n) {
		if (n == 0)
			return false;
		double res = Math.log(n) / Math.log(3);
		return Math.abs(res - Math.round(res)) < epsilon;
	}

	public boolean isPowerOfThree(int n) {
		if (n == 0)
			return false;
		if (n == 1)
			return true;
		if (n % 3 == 0)
			return isPowerOfThree(n / 3);
		return false;
	}

	public static void main(String[] args) {
		double res = Math.log(9) / Math.log(3);
		System.out.println(res);
		System.out.println(Math.abs(res - Math.round(res)));
	}
}
