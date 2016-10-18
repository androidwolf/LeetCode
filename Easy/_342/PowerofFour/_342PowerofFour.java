package _342.PowerofFour;

public class _342PowerofFour {

	private static final double epsilon = 10e-15;

	public boolean isPowerOfFour1(int n) {
		if (n == 0)
			return false;
		double res = Math.log(n) / Math.log(4);
		return Math.abs(res - Math.round(res)) < epsilon;
	}

	public boolean isPowerOfFour(int n) {
		if (n == 0)
			return false;
		if (n == 1)
			return true;
		if (n % 4 == 0)
			return isPowerOfFour(n / 4);
		return false;
	}

	public static void main(String[] args) {
		double res = Math.log(9) / Math.log(3);
		System.out.println(res);
		System.out.println(Math.abs(res - Math.round(res)));
	}
}
