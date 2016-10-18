package _198.HouseRobber;

public class _198HouseRobber {

	// ---����һ---
	public long houseRobber(int[] A) {
		// write your code here
		int n = A.length;
		if (n == 0)
			return 0;
		long[] res = new long[n + 1];

		res[0] = 0;
		res[1] = A[0];
		for (int i = 2; i <= n; i++) {
			res[i] = Math.max(res[i - 1], res[i - 2] + A[i - 1]);
		}
		return res[n];
	}

	// ---������---
	public long houseRobber1(int[] A) {
		// write your code here
		int n = A.length;
		if (n == 0)
			return 0;
		long[] res = new long[2];

		res[0] = 0;
		res[1] = A[0];
		for (int i = 2; i <= n; i++) {
			res[i % 2] = Math
					.max(res[(i - 1) % 2], res[(i - 2) % 2] + A[i - 1]);
		}
		return res[n % 2];
	}

	public int rob(int[] nums) {
		int best0 = 0; // ��ʾû��ѡ��ǰhouses
		int best1 = 0; // ��ʾѡ���˵�ǰhouses
		for (int i = 0; i < nums.length; i++) {
			int temp = best0;
			best0 = Math.max(best0, best1); // û��ѡ��ǰhouses����ô�������ϴ�ѡ���˻�ûѡ������ֵ
			best1 = temp + nums[i]; // ѡ���˵�ǰhouses��ֵֻ�ܵ����ϴ�ûѡ���+��ǰhouses��money
		}
		return Math.max(best0, best1);
	}

	public static void main(String[] args) {
	}
}
