package _165.CompareVersionNumbers;

public class _165CompareVersionNumbers {

	public static int cur1 = 0, cur2 = 0;

	public int compareVersion2(String version1, String version2) {
		String[] version1Arr = version1.split("\\.");
		String[] version2Arr = version2.split("\\.");
		System.out.println("--" + version1Arr.length);
		int i = 0, j = 0;
		while (i < version1Arr.length && j < version2Arr.length) {
			System.out.println(version1Arr[i] + "---" + version2Arr[i]);
			if (strToInt(version1Arr[i]) > strToInt(version2Arr[j]))
				return 1;
			if (strToInt(version1Arr[i]) < strToInt(version2Arr[j]))
				return -1;
			i++;
			j++;
		}

		while (i < version1Arr.length) {
			if (strToInt(version1Arr[i]) != 0) {
				return 1;
			}
			i++;
		}
		while (j < version2Arr.length) {
			if (strToInt(version2Arr[j]) != 0) {
				return -1;
			}
			j++;
		}
		/*
		 * while (i < version1Arr.length) { if (!version1Arr[i].equals("0")) {
		 * return 1; } i++; } while (j < version2Arr.length) { if
		 * (!version2Arr[j].equals("0")) { return -1; } i++; }
		 */return 0;
	}

	public int strToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum * 10 + s.charAt(i) - '0';
		}
		return sum;
	}

	public int compareVersion(String version1, String version2) {
		int indexA = 0; // 记录version1处理的位置
		int indexB = 0; // 记录version2处理的位置
		int countA = 0; // 记录version1的.号之的字符数
		int countB = 0; // 记录version2的.号之的字符数
		int max; // 记录countA和countB之间的较大者
		int a;
		int b;

		while (indexA < version1.length() || indexA < version2.length()) {
			while (indexA < version1.length() && version1.charAt(indexA) != '.') {
				countA++;
				indexA++;
			}
			while (indexB < version2.length() && version2.charAt(indexB) != '.') {
				countB++;
				indexB++;
			}
			max = countA > countB ? countA : countB;
			for (int i = max; i >= 1; i--) { // 从左向右比较
				a = countA - i >= 0 ? version1.charAt(indexA - i) - '0' : 0;
				b = countB - i >= 0 ? version2.charAt(indexB - i) - '0' : 0;
				if (a > b) {
					return 1;
				} else if (a < b) {
					return -1;
				}
			}

			countA = 0;
			countB = 0;
			indexA++;
			indexB++;
		}
		return 0;
	}

	int getVer(String str, int cur, int len) {
		int buffer = 0;
		while (str.charAt(cur) != '.' && cur < len) {
			buffer = buffer * 10 + str.charAt(cur) - '0';
			cur++;
		}
		cur++;
		return buffer;
	}

	public int compareVersion1(String version1, String version2) {
		while (cur1 < version1.length() || cur2 < version2.length()) {
			int v1 = getVer(version1, cur1, version1.length());
			int v2 = getVer(version2, cur2, version2.length());
			if (v1 > v2)
				return 1;
			else if (v1 < v2)
				return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new _165CompareVersionNumbers().strToInt("00000"));
		String s1 = "1.2";
		String s2 = "1.3";
		System.out.println(new _165CompareVersionNumbers().compareVersion2(s1,
				s2));
	}
}
