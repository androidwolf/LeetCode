package _231.PowerofTwo;

public class _231PowerofTwo {

	public boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		return (n & (n - 1)) == 0;
	}

	public boolean isPowerOfTwo1(int n) {
		int temp = 0, i = 0;
		while (n >= temp) {
			if (n == temp)
				return true;
			temp = (int) Math.pow(2, i++);
		}
		return false;
	}

	public static void main(String[] args) {
	}
}
