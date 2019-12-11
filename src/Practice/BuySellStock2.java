package Practice;

/*
 * Question Reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++) {
        	int difference = prices[i+1]- prices[i];
        	if(difference > 0) {
        		System.out.println(difference);
        		maxProfit += difference;
        	}
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
    	int[] pricesArray = new int[]{7,1,5,3,6,4};
    	BuySellStock2 bsstockObj = new BuySellStock2();
    	System.out.println(bsstockObj.maxProfit(pricesArray));
    }
}
