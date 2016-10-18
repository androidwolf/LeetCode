package _118.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class _118PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		int[][] temp = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
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
		return resultList;
	}

	public ArrayList<ArrayList<Integer>> generate1(int numRows) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0) {
            return rst;
        }

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(0, 1);
        rst.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(i + 1);
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            ArrayList<Integer> prev = rst.get(i - 1);
            tmp.set(0, prev.get(0));
            tmp.set(i, prev.get(i - 1));
            for (int j = 1; j < i; j++){
                tmp.set(j, prev.get(j - 1)+prev.get(j));
            }
            rst.add(tmp);
        }
        return rst;
    }
	
	public static void main(String[] args) {
	}
}
