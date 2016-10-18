package _283.MoveZeroes;

public class _283MoveZeroes {

	public void moveZeroes1(int[] nums) {
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] != 0) {
				if (j != i) {
					nums[i++] = nums[j];
					nums[j] = 0;
				} else
					++i;
			}
			++j;
		}
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				nums[j++] = nums[i];
		while (j < nums.length)
			nums[j++] = 0;
	}

	public static void main(String[] args) {
	}
}
