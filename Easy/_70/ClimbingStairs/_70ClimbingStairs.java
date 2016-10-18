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
		//���0�㣬����0
        if (n <= 0)
            return 0;
        //���ֻ��1����ݣ���ֻ��һ�ַ�ʽ
        else if (n == 1)
            return 1;
        //����������ݣ��������ַ�ʽ��ÿ����һ�㣬һ�������㣩
        else if (n == 2)
            return 2;

        int[] r = new int[n];
        //����������ʽ���� = ����ʣ��1��ķ�ʽ + ����ʣ��������ݵķ�ʽ
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
