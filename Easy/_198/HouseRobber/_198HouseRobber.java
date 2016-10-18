package _198.HouseRobber;

public class _198HouseRobber {

	// ---方法一---
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

	// ---方法二---
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
		int best0 = 0; // 表示没有选择当前houses
		int best1 = 0; // 表示选择了当前houses
		for (int i = 0; i < nums.length; i++) {
			int temp = best0;
			best0 = Math.max(best0, best1); // 没有选择当前houses，那么它等于上次选择了或没选择的最大值
			best1 = temp + nums[i]; // 选择了当前houses，值只能等于上次没选择的+当前houses的money
		}
		return Math.max(best0, best1);
	}

	public static void main(String[] args) {
	}
}
