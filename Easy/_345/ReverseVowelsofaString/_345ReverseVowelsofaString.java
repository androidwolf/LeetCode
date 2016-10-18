package _345.ReverseVowelsofaString;

public class _345ReverseVowelsofaString {

	public String reverseVowels(String s) {
		char[] ss = s.toCharArray();
		int j = ss.length - 1, i = 0;
		char temp;
		while (i < j) {
			while (i < j && !isVowel(ss[i]))
				i++;
			while (i < j && !isVowel(ss[j]))
				j--;
			temp = ss[i];
			ss[i] = ss[j];
			ss[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ss);
	}

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out
				.println(new _345ReverseVowelsofaString().reverseVowels(".,"));
		System.out.println(new _345ReverseVowelsofaString()
				.reverseVowels("leetcode"));
	}
}
