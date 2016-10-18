package _219.ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

public class _219ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> appearedNum = new HashSet<Integer>();
		int start = 0, end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!appearedNum.contains(nums[i])) {
				appearedNum.add(nums[i]);
				end++;
			} else
				return true;
			if (end - start > k) {
				appearedNum.remove(nums[start]);
				start++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 1 };
		System.out.println(new _219ContainsDuplicateII()
				.containsNearbyDuplicate(a, 1));
	}
}
