package Practice;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
    	int profit = 0, buy = 0, sell =0;
    	if(prices.length == 0) {
    		return 0;
    	}else {
    		buy = prices[0];
    		sell = prices[0];
    	}
    	for(int i=1;i<prices.length;i++) {
    		if(prices[i]<sell) {
    			sell = prices[i];
    		}
    		if(prices[i]>buy) {
    			buy = prices[i];
    		}
    	}
    	profit = buy
        return 0;
    }
    public static void main(String[] args) {
    	System.out.println("Inside main");
    }
}
