class Solution {
    public int search(int[] arr, int target) {

        int n = arr.length;
		int start = 0;
		int end = n -1;
		
		while ( end >= start ) {
			int mid = (start + end)/2;
			if( target == arr[mid] ) {
				return mid;
			}
			
			else if( target > arr[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
        
    }
}
