package _349.IntersectionofTwoArrays;

import java.util.ArrayList;
import java.util.List;

public class _349IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		int j = 0;
		int[] temp = new int[nums2.length];
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++)
			list.add(nums1[i]);
		for (int i = 0; i < nums2.length; i++)
			if (list.contains(nums2[i]) && !list2.contains(nums2[i])) {
				list2.add(nums2[i]);
				temp[j++] = nums2[i];
			}
		int[] temp2 = new int[j];
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = temp[i];
		}
		return temp2;
	}

	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {1,2,4};
		int[] a = new _349IntersectionofTwoArrays().intersection(nums1, nums2);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
