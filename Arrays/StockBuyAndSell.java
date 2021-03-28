package Arrays;
import java.util.*;
public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,5,3,8,12};
		System.out.println(maxProfit(arr, 0, arr.length -1));
		System.out.println(maxP(arr));
//		System.out.println();
	}
//O(n^2)
	static int maxProfit( int price[] ,int start , int end)
	 {
		 if(end <= start)
			 return 0;

		 int profit  = 0;
		 for( int i =start ; i<end; i++)
		 {
			 for( int j =i+1; j<=end; j++)
			 {
				 if(price[j]  > price[i])
				 {
					 int curr_profit = price[j] - price[i] + maxProfit(price, start, i-1)
					 + maxProfit(price, j+1, end);
					 
					 profit = Math.max(profit, curr_profit);
				 }
			 }
		 }
		 return profit;
	 }
	
//	O(n) -  keep on adding the if profit is ocurring(if element next is greater than prev)
	static int maxP(int price[])
	{
		int profit = 0 ;
		for( int i = 1; i<price.length;  i++)
		{
			if(price[i] > price[i-1])
				profit += price[i] - price[i-1];
			
		}
		return profit;
	}
}
