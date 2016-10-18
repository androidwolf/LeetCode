package _9.PalindromeNumber;

public class _9PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int m = x;
		int temp = 0;
		int reserveNum = 0;
		while (x != 0) {
			temp = reserveNum * 10 + x % 10;
			x = x / 10;
			if (temp / 10 != reserveNum) {
				reserveNum = 0;
				break;
			}
			reserveNum = temp;
		}
		if (m == reserveNum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(new _9PalindromeNumber().isPalindrome(-12321));
	}
}
