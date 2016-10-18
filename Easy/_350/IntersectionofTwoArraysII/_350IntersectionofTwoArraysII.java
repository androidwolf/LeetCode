package _350.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _350IntersectionofTwoArraysII {

	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++)
			if (map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i]) + 1);
			else
				map.put(nums1[i], 1);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++)
			if (map.containsKey(nums2[i])) {
				map.put(nums2[i], map.get(nums2[i]) - 1);
				if (map.get(nums2[i]) >= 0)
					list.add(nums2[i]);
			}
		int[] temp2 = new int[list.size()];
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = list.get(i);
		}
		return temp2;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 1, 2, 2 };
		int[] a = new _350IntersectionofTwoArraysII().intersect(nums1, nums2);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
