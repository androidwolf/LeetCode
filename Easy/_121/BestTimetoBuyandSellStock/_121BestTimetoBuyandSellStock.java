package _121.BestTimetoBuyandSellStock;

public class _121BestTimetoBuyandSellStock {

	public int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;
		int minPro = prices[0];
		int maxGap = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - minPro > maxGap)
				maxGap = prices[i] - minPro;
			if (prices[i] < minPro)
				minPro = prices[i];
		}
		return maxGap;
	}

	public static void main(String[] args) {
	}
}
