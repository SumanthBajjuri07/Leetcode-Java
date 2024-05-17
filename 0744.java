


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;
		int start = 0;
		int end = n -1;

        if(target >= letters[n-1] || target < letters[0]){
            return letters[0];
        }
		
		while ( end >= start ) {
			int mid = (start + end)/2;
			// if( target == letters[mid] ) {
			// 	return letters[mid+1];
			// }
			
			if( target < letters[mid]) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
		}
		return letters[start];
        
    }

}
