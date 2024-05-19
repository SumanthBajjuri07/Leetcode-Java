class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
		int start = 0;
		int end = n -1;
		while ( end >= start ) {
			int mid = (start + end)/2;
			if( target == nums[mid] ) {
				return mid;
			}
			else if( target > nums[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		}
        if(end > start ){
            return end;

        }
        return start;

		
        
    }
}
