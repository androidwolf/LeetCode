package _258.AddDigits;

public class _258AddDigits {

	public int addDigits2(int num) {
		return 1 + (num - 1) % 9;
	}

	public int addDigits1(int num) {
		while (num >= 10) {
			num = (num / 10) + num % 10;
		}
		return num;
	}

	public int addDigits(int num) {
		if (num / 10 == 0)
			return num;
		int sum = 0;
		while (true) {
			sum += num % 10;
			num = num / 10;
			if (num == 0) {
				if (sum / 10 == 0)
					return sum;
				num = sum;
				sum = 0;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new _258AddDigits().addDigits2(20228));
	}
}
