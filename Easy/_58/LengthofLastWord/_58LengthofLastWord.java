package _58.LengthofLastWord;

public class _58LengthofLastWord {

	public int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0)
			return 0;
		String[] strs = s.split(" ");
		if (strs.length == 0)
			return 0;
		int len = strs[strs.length - 1].length();
		if (len > 0)
			return len;
		else
			return 0;
	}
	
	public int lengthOfLastWord1(String s) {
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length == 0) {
                if (chars[i] == ' ') {
                    continue;
                } else {
                    length++;
                }
            } else {
                if (chars[i] == ' ') {
                    break;
                } else {
                    length++;
                }
            }
        }

        return length;
    }

	public static void main(String[] args) {
		System.out.println(new _58LengthofLastWord().lengthOfLastWord(" "));
	}
}
