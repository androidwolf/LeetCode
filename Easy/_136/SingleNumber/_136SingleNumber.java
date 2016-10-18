package _136.SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class _136SingleNumber {

	public int singleNumber(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		if (nums.length % 2 == 0)
			return 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (temp.contains(i))
				continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (temp.contains(j))
					continue;
				if (nums[i] == nums[j]) {
					System.out.println(i + "---" + j);
					temp.add(i);
					temp.add(j);
					break;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (!temp.contains(i)) {
				return nums[i];
			}
		}
		return 0;
	}

	public int singleNumber1(int[] nums) {
		ArrayList<Integer> preList = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int len = nums.length;
		int[] flag = new int[len];
		Arrays.fill(flag, 0);
		for (int i = 0; i < len; i++) {
			if (!preList.contains(nums[i])) {
				preList.add(nums[i]);
			} else {
				flag[i] = 1;
			}
			if (!list.contains(nums[len - 1 - i])) {
				list.add(nums[len - 1 - i]);
			} else {
				flag[len - 1 - i] = 1;
			}
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == 0) {
				return nums[i];
			}
		}
		return 0;
	}

	public int singleNumber2(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return nums[0];
		int[] flag = new int[n];
		for (int i = 0; i < n; i++) {
			if (flag[i] == 1)
				continue;
			else {
				for (int j = i + 1; j < n; j++) {
					if (nums[i] == nums[j]) {
						flag[i] = 1;
						flag[j] = 1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (flag[i] == 0)
				return nums[i];
		}
		return 0;
	}
	
	public int singleNumber3(int[] A) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, -1, 2, 3, 3 };
		System.out.println(new _136SingleNumber().singleNumber1(a));
	}
}
