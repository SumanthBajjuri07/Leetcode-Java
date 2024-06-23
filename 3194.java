class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
			double[] averages = new double[n/2];
			Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
			
			
			for(int i =0; i<n/2; i++) {
				double avg = (nums[i] + nums[n-i-1])/2.0;
				averages[i]=avg;
			}
			
			System.out.println(Arrays.toString(averages));
			Arrays.sort(averages);
			System.out.println(Arrays.toString(averages));
			return averages[0];
            
    }
}
