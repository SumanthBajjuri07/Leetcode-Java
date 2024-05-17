class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans1 = search(nums, target, true);
        int ans2 = search(nums, target, false);

        int[] arr = {ans1, ans2};
        return arr;        
    }


    public int search(int[] nums , int target, boolean isStartIndex){
        int ans = -1;
        int n = nums.length;
		int start = 0;
		int end = n -1;
		
		while ( end >= start ) {
			int mid = (start + end)/2;
			if( target == nums[mid] ) {
                ans = mid;
				if(isStartIndex){
                    end = mid -1;

                }
                else {
                    start = mid + 1;
                }
			}
			
			else if( target > nums[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		}
		return ans;
    }
}
