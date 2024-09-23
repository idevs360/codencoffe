package array;

public class MaximumSubArray {

	public static void main(String[] args) throws Exception {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = getMaxiumSubArraySum(nums);
		
		System.out.println("Maxium sum of contagius Array is: "+maxSum);
	}

	private static int getMaxiumSubArraySum(int[] nums) throws Exception {
		if (nums.length==0) {
			throw new Exception("Empty Array!");
		}
		
		if (nums.length==1) {
			return nums[0];
		}
		
		int currentSum = nums[0];
		int maxSum = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], nums[i]+currentSum);
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
	}
}
