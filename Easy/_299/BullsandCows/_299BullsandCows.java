package _299.BullsandCows;

import java.util.ArrayList;
import java.util.List;

public class _299BullsandCows {

	public String getHint(String secret, String guess) {
		int countA = 0, countB = 0;
		List<Character> list = new ArrayList<Character>();
		List<Character> listB = new ArrayList<Character>();
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i))
				countA++;
			else {
				list.add(secret.charAt(i));
				listB.add(guess.charAt(i));
			}
		}
		for (Character c : listB)
			if (list.contains(c)) {
				countB++;
				list.remove(c);
			}
		return countA + "A" + countB + "B";
	}

	public static void main(String[] args) {
		System.out.println(new _299BullsandCows().getHint("11", "10"));
	}
}
