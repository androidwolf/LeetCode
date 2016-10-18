package _119.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class _119PascalsTriangleII {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		int[][] temp = new int[rowIndex + 1][rowIndex + 1];
		for (int i = 0; i < rowIndex + 1; i++) {
			temp[i][0] = 1;
			temp[i][i] = 1;
			for (int j = 0; j <= i; j++) {
				if (j < i && i > 1 && j > 0)
					temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
				list.add(temp[i][j]);
			}
			resultList.add(list);
			list = new ArrayList<Integer>();
		}
		return resultList.get(rowIndex);
	}

	public List<Integer> getRow1(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		rowIndex++;
		list.add(1);
		for (int i = 1; i < rowIndex; i++) {
			List<Integer> temp = new ArrayList<Integer>(i + 1);
			for (int j = 0; j < i + 1; j++)
                temp.add(-1);
			temp.set(0, list.get(0));
			temp.set(i, list.get(i - 1));
			for (int j = 1; j < i; j++)
				temp.set(j, list.get(j - 1) + list.get(j));
			list = temp;
		}
		return list;
	}

	public static void main(String[] args) {
	}
}
