package _189.RotateArray;

public class _189RotateArray {

	public void rotate1(int[] nums, int k) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {

		}
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		if (k >= 1 && nums.length > k) {
			reverseArr1(nums, 0, nums.length - 1);
			reverseArr1(nums, 0, k - 1);
			reverseArr1(nums, k, nums.length - 1);
		}
	}

	/**
	 * @param nums
	 * @param m
	 *            起始位置1开始
	 * @param n
	 *            结束位置
	 */
	public void reverseArr(int[] nums, int m, int n) {
		int temp = 0, len = n - 1;
		for (int i = m - 1; i < ((n - m) / 2 + m); i++) {
			temp = nums[i];
			nums[i] = nums[len - i];
			nums[len - i] = temp;
		}
	}

	/**
	 * 
	 * @param nums
	 * @param m
	 *            要交换的起始位置，按照数组下标0开始
	 * @param n
	 *            要交换的结束位置，按照数组下标0开始
	 */
	public void reverseArr1(int[] nums, int m, int n) {
		int temp = 0;
		while (m < n) {
			temp = nums[m];
			nums[m] = nums[n];
			nums[n] = temp;
			m++;
			n--;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		// new _189RotateArray().reverseArr1(a, 0, a.length - 1);
		// new _189RotateArray().reverseArr1(a, 0, a.length - 4);
		// new _189RotateArray().reverseArr(a, a.length - 3, a.length - 1);
		new _189RotateArray().rotate(a, 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
