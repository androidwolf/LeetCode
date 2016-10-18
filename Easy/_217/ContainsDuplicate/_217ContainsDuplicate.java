package _217.ContainsDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _217ContainsDuplicate {

	public boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	public boolean containsDuplicate1(int[] nums) {
		Set<Integer> unique = new HashSet<Integer>();
		for (int x : nums) {
			if (unique.contains(x))
				return true;
			else
				unique.add(x);
		}
		return false;
	}

	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0)
			return false;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i]))
				return true;
			else
				list.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
	}
}
