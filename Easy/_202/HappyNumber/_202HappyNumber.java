package _202.HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class _202HappyNumber {

	public boolean isHappy2(int n) {  
	    int[] mark = new int[8];  
	    while (n > 1) {  
	        n = convert(n);  
	        if (n < 243) {  
	            int sec = n >> 5;  
	            int mask = 1 << (n & 0x1f);  
	            if ((mark[sec] & mask) > 0) {  
	                return false;  
	            }  
	            mark[sec] |= mask;  
	        }  
	    }  
	    return true;  
	}  
	  
	private int convert(int n) {  
	    int sum = 0;  
	    while (n > 0) {  
	        int t = n % 10;  
	        sum += t * t;  
	        n /= 10;  
	    }  
	    return sum;  
	}  
	
	public boolean isHappy1(int n) {
		if (n == 0) {
			return false;
		}

		if (n == 1) {
			return true;
		}

		int temp = 0;
		boolean flag[] = new boolean[811];
		int yushu = 0;

		while (true) {
			while (n != 0) {
				yushu = n % 10;
				n = n / 10;
				temp += yushu * yushu;
			}

			if (temp == 1) {
				return true;
			}

			if (flag[temp]) {
				return false;
			} else {
				flag[temp] = true;
			}

			n = temp;
			temp = 0;
		}
	}

	public boolean isHappy(int n) {
		if (n == 0)
			return false;
		if (n == 1)
			return true;

		int temp = 0, sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(n);
		while (true) {
			temp = n % 10;
			sum = sum + temp * temp;
			n = n / 10;
			if (n == 0) {
				if (sum == 1)
					return true;
				if (list.contains(sum))
					return false;
				n = sum;
				list.add(sum);
				sum = 0;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new _202HappyNumber().isHappy(3));
	}
}
