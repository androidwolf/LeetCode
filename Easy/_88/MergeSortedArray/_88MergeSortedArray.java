package _88.MergeSortedArray;

public class _88MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (nums2[j] < nums1[i]) {
				for (int p = m; p > i; p--)
					nums1[p] = nums1[p - 1];
				nums1[i] = nums2[j];
				j++;
				m++;
			}
			i++;
		}
		while (j < n) {
			nums1[i] = nums2[j];
			i++;
			j++;
		}
	}

	/**
	 * @param A
	 *            : sorted integer array A which has m elements, but size of A
	 *            is m+n
	 * @param B
	 *            : sorted integer array B which has n elements
	 * @return: void
	 */
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int i = m - 1, j = n - 1, index = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (A[i] > B[j]) {
				A[index--] = A[i--];
			} else {
				A[index--] = B[j--];
			}
		}
		while (i >= 0) {
			A[index--] = A[i--];
		}
		while (j >= 0) {
			A[index--] = B[j--];
		}
	}

	public static void main(String[] args) {

	}
}
