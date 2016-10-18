package _26.RemoveDuplicatesfromSortedArray;

public class _26RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int j = 0;
		int temp[] = new int[nums.length];
		temp[j++] = nums[0];
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] != nums[i + 1])
				temp[j++] = nums[i + 1];
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		return j;
	}

	public int removeDuplicates1(int[] nums) {
		if (nums.length == 0)
			return 0;
		int k = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				k++;
			else
				nums[i + 1 - k] = nums[i + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		return nums.length - k;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 2, 3 };
		System.out.println(new _26RemoveDuplicatesfromSortedArray()
				.removeDuplicates1(nums));
	}
}
