package _204.CountPrimes;

import java.util.ArrayList;
import java.util.List;

public class _204CountPrimes {

	public List<Integer> list = new ArrayList<Integer>();

	public int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i < n; i++)
			if (isPrime1(i)) {
				list.add(i);
				count++;
			}
		return count;
	}

	public boolean isPrime1(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		int sqetN = (int) Math.sqrt(n);
		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			if (temp > sqetN)
				break;
			if (n % temp == 0)
				return false;
		}
		return true;
	}

	public boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new _204CountPrimes().countPrimes(4));
	}
}
