package _27.RemoveElement;

public class _27RemoveElement {
	
	public int removeElement1(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val)
				nums[j++] = nums[i];
		}
		for (int i = 0; i < j; i++) {
			System.out.print(nums[i] + "--");
		}
		System.out.println();
		return j;
	}

	public int removeElement(int[] nums, int val) {
		sortInt(nums);
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val)
				k++;
			if (nums[i] > val) {
				nums[i - k] = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "--");
		}
		return nums.length - k;
	}

	public int[] sortInt(int[] a) {
		int k, temp;
		for (int i = 0; i < a.length; i++) {
			k = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[k] > a[j])
					k = j;
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2, 2, 2, 3 };
		int[] a = new _27RemoveElement().sortInt(nums);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(new _27RemoveElement().removeElement1(nums, 2));
	}
}
