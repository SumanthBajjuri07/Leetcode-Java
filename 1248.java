class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				nums[i]=0;
			}
			else {
				nums[i]=1;
			}
		}
		
		int ans =  numSubarraysWithLessThanOrEqualToK( nums, k) - numSubarraysWithLessThanOrEqualToK(nums,k-1);
		return ans;
        
    }
	
	public static int numSubarraysWithLessThanOrEqualToK(int[] nums, int goal2) {
		
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
