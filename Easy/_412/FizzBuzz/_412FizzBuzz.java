package _412.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class _412FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
				continue;
			} else {
				if (i % 3 == 0) {
					list.add("Fizz");
					continue;
				}
				if (i % 5 == 0) {
					list.add("Buzz");
					continue;
				}
			}
			list.add(Integer.toString(i));
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new _412FizzBuzz().fizzBuzz(5));
	}
}
