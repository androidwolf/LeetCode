package _169.MajorityElement;

import java.util.Arrays;

public class _169MajorityElement {

	public int majorityElement2(int[] nums) {
		int temp = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				temp = nums[i];
				count++;
			} else if (temp == nums[i])
				count++;
			else
				count--;
		}
		return temp;
	}

	public int majorityElement1(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] flag = new int[nums.length];
		Arrays.fill(flag, 0);
		for (int i = 0; i < nums.length - 1; i++) {
			if (flag[i] != 0)
				continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (flag[j] != 0)
					continue;
				if (nums[i] != nums[j]) {
					flag[i] = 1;
					flag[j] = 1;
					break;
				}
			}
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] != 1) {
				return nums[i];
			}
		}
		return 0;
	}

	public int majorityElement(int[] nums) {
		if (nums.length == 0)
			return 0;
		int sum = 0;
		int max = 0, temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++)
				if (nums[i] == nums[j])
					sum++;
			if (sum > max) {
				temp = i;
				max = sum;
			}
			sum = 0;
		}
		return nums[temp];
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 3, 3 };
		System.out.println(new _169MajorityElement().majorityElement2(a));
	}
}
