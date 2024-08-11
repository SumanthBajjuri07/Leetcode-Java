class Solution {
    public static int numSubarraysWithSum(int[] nums, int goal) {
		
		int ans =  numSubarraysWithLessThanOrEqualToSum( nums, goal) - numSubarraysWithLessThanOrEqualToSum(nums,goal-1);
		return ans;
	}
	
	public static int numSubarraysWithLessThanOrEqualToSum(int[] nums, int goal2) {
		
		if(goal2 < 0) {
			return 0;
		}
		int count=0;
		int r=0;
		int l=0;
		int sum=0;
		
		while(r < nums.length) {
			sum = sum + nums[r];
			
			
			
			while(sum > goal2) {
				sum = sum - nums[l];
				l++;
			}
			
			if(sum <= goal2) {
				count = count + (r-l+1);
			}
			
			
			r++;
		}
		
		
		return count;
	}
}
