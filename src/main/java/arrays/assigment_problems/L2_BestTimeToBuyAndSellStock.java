package arrays.class_problems;
public class L2_BestTimeToBuyAndSellStock {
    static int maxProfit(int[] prices){
        int min=prices[0], profit=0;
        for(int i=1;i<prices.length;i++){ profit=Math.max(profit,prices[i]-min); min=Math.min(min,prices[i]); }
        return profit;
    }
    public static void main(String[] args){ System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); }
}