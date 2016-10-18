package _70.ClimbingStairs;

public class _70ClimbingStairs {

	public int climbStairs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return climbStairs(n-1) + climbStairs(n-2);
	}

	public int climbStairs1(int n) {
		//如果0层，返回0
        if (n <= 0)
            return 0;
        //如果只有1层阶梯，则只有一种方式
        else if (n == 1)
            return 1;
        //若有两层阶梯，则有两种方式（每次走一层，一次走两层）
        else if (n == 2)
            return 2;

        int[] r = new int[n];
        //其余的情况方式总数 = 最终剩余1层的方式 + 最终剩余两层阶梯的方式
        r[0] = 1;
        r[1] = 2;

        for (int i = 2; i < n; i++)
            r[i] = r[i - 1] + r[i - 2];

        int ret = r[n - 1];
        return ret;
	}
	
	public int climbStairs2(int n) {
        if (n <= 1) {
            return 1;
        }
        int last = 1, lastlast = 1;
        int now = 0;
        for (int i = 2; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
    }
	
	public static void main(String[] args) {
		System.out.println(new _70ClimbingStairs().climbStairs1(44));
	}
}
