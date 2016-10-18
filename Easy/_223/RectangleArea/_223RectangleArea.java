package _223.RectangleArea;

public class _223RectangleArea {
	public int computeArea2(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int val = (C - A) * (D - B) + (G - E) * (H - F);
		if (E > C || G < A || F > D || H < B) {
			return val;
		}
		val -= (Math.min(C, G) - Math.max(A, E))
				* (Math.min(D, H) - Math.max(B, F));
		return val;
	}

	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int area1 = (C - A) * (D - B);
		int area2 = (G - E) * (H - F);

		int overlapRegion = overlap(A, B, C, D, E, F, G, H);
		return area1 + area2 - overlapRegion;
	}

	private int overlap(int A, int B, int C, int D, int E, int F, int G, int H) {
		// int h1 = Math.max(A, E);
		// int h2 = Math.min(C, G);
		// int h = h2 - h1;
		int h = Math.max(A, E) - Math.min(C, G);

		// int v1 = Math.max(B, F);
		// int v2 = Math.min(D, H);
		// int v = v2 - v1;
		int v = Math.max(B, F) - Math.min(D, H);

		if (h <= 0 || v <= 0)
			return 0;
		else
			return h * v;
	}

	/**
	 * 这个算法不能算重叠那种情况的面积
	 * 
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @param E
	 * @param F
	 * @param G
	 * @param H
	 * @return
	 */
	public int computeArea1(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int size = (C - A) * (D - B) + (G - E) * (H - F);
		if (C <= E || B >= H || A >= G || D <= F)
			return size;
		if ((A >= E && B >= F && C <= G && D <= H)
				|| (A <= E && B <= F && C >= G && D >= H))
			return Math.max((C - A) * (D - B), (G - E) * (H - F));
		int coveredSize = 0;
		coveredSize = Math.abs(C - E) * Math.abs(H - B);
		return size - coveredSize;
	}

	public static void main(String[] args) {
		System.out.println(new _223RectangleArea().computeArea2(-1500000001, 0,
				-1500000000, 1, 1500000000, 0, 1500000001, 1));
		System.out.println(new _223RectangleArea().computeArea(-1500000001, 0,
				-1500000000, 1, 1500000000, 0, 1500000001, 1));
	}
}
