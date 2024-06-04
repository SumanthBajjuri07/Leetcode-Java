class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
       int n = nums.length;
		int[] ans = new int[51];
		Arrays.fill(ans, 0);

		for(int i =0; i<n; i++) {
			
			ans[nums[i]]++;
		}
		
		int xor =0;
		for(int i=0; i<51; i++) {
			if(ans[i]==2) {
				xor = xor ^ i;
			}
		}
		
		return xor;
	
	}
}
