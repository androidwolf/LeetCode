package _396.RotateFunction;

public class _396RotateFunction {

	public int maxRotateFunction(int[] A) {
		int len = A.length;
		int max = 0, sum = 0, presum = 0;
		for (int i = 0; i < len; i++) {
			sum += A[i];
			presum += A[i] * i;
		}
		max = presum;
		for (int i = len - 1; i >= 0; i--) {
			presum += sum - len * A[i];
			max = Math.max(max, presum);
		}
		return max;
	}

	public static void main(String[] args) {
	}
}
