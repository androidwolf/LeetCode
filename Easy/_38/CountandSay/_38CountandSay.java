package _38.CountandSay;

public class _38CountandSay {

	public String countAndSay1(int n) {
		if (n == 1)
			return "1";
		String str = countAndSay(n - 1) + "*";
		char[] c = str.toCharArray();
		int count = 1;
		String s = "";
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1])
				count++;
			else {
				s = s + count + c[i];
				count = 1;
			}
		}
		return s;
	}

	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		// �ݹ���ã�Ȼ����ַ�������
		String str = countAndSay(n - 1) + "*";// Ϊ��strĩβ�ı�ǣ�����ѭ������
		char[] c = str.toCharArray();
		int count = 1;
		String s = "";
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;// ��������
			} else {
				s = s + count + c[i];// �����*������﷽��ͳһ����
				count = 1;// ��ʼ��
			}
		}
		return s;
	}

	public String countAndSay2(int n) {
		String oldString = "1";
		while (--n > 0) {
			StringBuilder sb = new StringBuilder();
			char[] oldChars = oldString.toCharArray();

			for (int i = 0; i < oldChars.length; i++) {
				int count = 1;
				while ((i + 1) < oldChars.length
						&& oldChars[i] == oldChars[i + 1]) {
					count++;
					i++;
				}
				sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
			}
			oldString = sb.toString();
		}

		return oldString;
	}

	public static void main(String[] args) {
		System.out.println(new _38CountandSay().countAndSay2(3));
	}
}
