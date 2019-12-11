package Practice;

import java.util.Arrays;


/*
 * Problem reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BuySellStock {
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int minValue = 9999;
    	for(int i=0;i<prices.length;i++) {
    		minValue = Math.min(minValue, prices[i]);
    		maxProfit = Math.max(maxProfit, prices[i]-minValue);
    	}
        return maxProfit;
    }
    
    public static void main (String[] args) {
    	int[] input = new int[] {7,1,5,3,6,4};
    	BuySellStock stockObj = new BuySellStock();
    	System.out.println(stockObj.maxProfit(input));
    }
}
