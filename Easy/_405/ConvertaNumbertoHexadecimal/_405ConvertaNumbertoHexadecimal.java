package _405.ConvertaNumbertoHexadecimal;

public class _405ConvertaNumbertoHexadecimal {

	public String toHex1(int num) {
		if (num >= 0 && num < 10)
			return Integer.toString(num);
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
				'b', 'c', 'd', 'e', 'f' };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8 && num != 0; i++) {
			sb.insert(0, hex[num & 15]);
			num = num >> 4;
		}
		return sb.toString();
	}

	public String toHex(int num) {
		if (num >= 0 && num < 10)
			return Integer.toString(num);
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
				'b', 'c', 'd', 'e', 'f' };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8 && num != 0; i++) {
			sb.insert(0, hex[num & 15]);
			num = num >> 4;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new _405ConvertaNumbertoHexadecimal().toHex(26));
		System.out.println(new _405ConvertaNumbertoHexadecimal().toHex1(26));
	}
}
