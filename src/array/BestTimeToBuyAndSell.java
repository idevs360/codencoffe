package array;

public class BestTimeToBuyAndSell {
	
	public static void main(String[] args) {
		int [] arr = {5,8,4,9,1,10};
		
		int max = getMaximumProfit(arr);
		
		System.out.println("maximum profit gained is: "+max);
	}

	private static int getMaximumProfit(int[] arr) {
		int buy = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i : arr) {
			if (i<buy) {
				buy = i;
			} 
			else {
				int profit = i-buy;
				
				if (profit>maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

}
