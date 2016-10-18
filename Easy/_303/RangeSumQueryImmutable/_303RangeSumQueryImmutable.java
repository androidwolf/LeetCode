package _303.RangeSumQueryImmutable;

import java.util.Arrays;

public class _303RangeSumQueryImmutable {

	public int[] nums;

	public _303RangeSumQueryImmutable(int[] nums) {
		if (nums.length == 0)
			return;
		this.nums = new int[nums.length];
		Arrays.fill(this.nums, 0);
		this.nums[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			this.nums[i] = this.nums[i - 1] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		if (this.nums.length == 0)
			return 0;
		if (j > this.nums.length - 1)
			j = this.nums.length - 1;
		if (i == 0)
			return this.nums[j];
		return this.nums[j] - this.nums[i - 1];
	}

	public static void main(String[] args) {
	}
}
