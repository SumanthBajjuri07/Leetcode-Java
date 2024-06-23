class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int n = nums.length;
		int max=0;
		int ans=0;
			
		if(n < 2) {
			return 0;
		}
		
		for(int i=1; i<n; i++) {
			max = nums[i] - nums[i-1];
			if(max >= ans) {
				ans = max;
			}
		}
		
		
		return ans;
    }
}
