package _278.FirstBadVersion;

public class _278FirstBadVersion {

	public int firstBadVersion(int n) {
		int low = 1, high = n;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid))
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	private boolean isBadVersion(int n) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
	}
}
