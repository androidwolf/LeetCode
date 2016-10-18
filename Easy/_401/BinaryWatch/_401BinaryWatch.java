package _401.BinaryWatch;

import java.util.ArrayList;
import java.util.List;

public class _401BinaryWatch {

	int hour[] = new int[] { 1, 2, 4, 8 };
	int minu[] = new int[] { 1, 2, 4, 8, 16, 32 };

	public List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i <= num; i++) {
			dspCombination(hour, i, 0, true);
			dspCombination(minu, num - i, 0, false);

			for (int m : hs) {
				for (int n : ms) {
					if (n == 0)
						res.add("" + m + ":00");
					else {
						if (n / 10 == 0)
							res.add("" + m + ":0" + n);
						else
							res.add("" + m + ":" + n);
					}
				}
			}
			hs.clear();
			ms.clear();
		}
		return res;
	}

	List<Integer> list = new ArrayList<Integer>();
	List<Integer> hs = new ArrayList<Integer>();
	List<Integer> ms = new ArrayList<Integer>();

	private void dspCombination(int[] nums, int k, int level, boolean flag) {
		if (list.size() == k) {
			int sum = 0;
			for (int num : list) {
				sum += num;
			}
			if (flag) { // µ±Ç°ÊÇhour
				if (sum <= 11)
					hs.add(sum);
			} else {
				if (sum <= 59)
					ms.add(sum);
			}
			return;
		} else if (list.size() > k) {
			return;
		} else {
			for (int i = level; i < nums.length; i++) {
				list.add(nums[i]);
				dspCombination(nums, k, i + 1, flag);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
	}
}
