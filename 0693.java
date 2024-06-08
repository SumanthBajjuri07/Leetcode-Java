class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastBinary = n %2;
		n = n/2;
		
		while(n >0) {
			
			if(lastBinary == n%2) {
				return false;
			}
			else { 
		     lastBinary = n%2;
			 n = n >> 1;
			}
		}
		
		
		return true;
    }
}
