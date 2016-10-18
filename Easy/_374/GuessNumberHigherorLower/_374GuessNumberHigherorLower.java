package _374.GuessNumberHigherorLower;

public class _374GuessNumberHigherorLower {

	public int guessNumber1(int n) {
		int low = 1, high = n;
		while (low < high) {
			int mid = (high - low) / 2 + low;
			int val = guess(mid);
			if (val == 0)
				return mid;
			else if (val == 1)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public int guessNumber(int n) {
		int low = 1, high = n;
		while (low <= high) {
			int mid = (high - low) / 2 + low, val = guess(mid);
			if (val == 0)
				return mid;
			else if (val == -1)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	private int guess(int mid) {
		return 0;
	}

	public static void main(String[] args) {
	}
}
