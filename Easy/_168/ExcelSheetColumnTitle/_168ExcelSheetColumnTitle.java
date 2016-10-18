package _168.ExcelSheetColumnTitle;

public class _168ExcelSheetColumnTitle {

	/**
	 * 非递归形式
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle1(int n) {
		if (n == 0)
			return "";
		if (n <= 26)
			return intToStr(n);
		String str = "";
		int temp = 0;
		while (n != 0) {
			temp = (n - 1) % 26;
			str = intToStr2(temp) + str;
			n = (n - 1) / 26;
		}
		return str;
	}
	
	/**
	 * 最好的方式
	 */
	public String convertToTitle2(int n) {
		String ret = "";
		while (n != 0) {
			ret = (char) ((n - 1) % 26 + 'A') + ret;
			n = (n - 1) / 26;
		}
		return ret;
	}

	/**
	 * 递归形式
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		if (n == 0)
			return "";
		if (n <= 26)
			return intToStr(n);
		String str = "";
		int temp = n % 26;
		int i = n / 26;
		if (temp == 0)
			i--;
		str += convertToTitle(i);
		str += intToStr(temp);
		return str;
	}

	public String intToStr2(int x) {
		switch (x) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		case 3:
			return "D";
		case 4:
			return "E";
		case 5:
			return "F";
		case 6:
			return "G";
		case 7:
			return "H";
		case 8:
			return "I";
		case 9:
			return "J";
		case 10:
			return "K";
		case 11:
			return "L";
		case 12:
			return "M";
		case 13:
			return "N";
		case 14:
			return "O";
		case 15:
			return "P";
		case 16:
			return "Q";
		case 17:
			return "R";
		case 18:
			return "S";
		case 19:
			return "T";
		case 20:
			return "U";
		case 21:
			return "V";
		case 22:
			return "W";
		case 23:
			return "X";
		case 24:
			return "Y";
		case 25:
			return "Z";
		}
		return "";
	}

	public String intToStr(int x) {
		switch (x) {
		case 0:
			return "Z";
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		case 6:
			return "F";
		case 7:
			return "G";
		case 8:
			return "H";
		case 9:
			return "I";
		case 10:
			return "J";
		case 11:
			return "K";
		case 12:
			return "L";
		case 13:
			return "M";
		case 14:
			return "N";
		case 15:
			return "O";
		case 16:
			return "P";
		case 17:
			return "Q";
		case 18:
			return "R";
		case 19:
			return "S";
		case 20:
			return "T";
		case 21:
			return "U";
		case 22:
			return "V";
		case 23:
			return "W";
		case 24:
			return "X";
		case 25:
			return "Y";
		case 26:
			return "Z";
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(new _168ExcelSheetColumnTitle().convertToTitle1(753));
	}
}
