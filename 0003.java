class Solution {
    public static int lengthOfLongestSubstring(String s) {
		
		int[] arr = new int[256];
		int l=0;
		int r=0;
		int maxlen=0;
		int len=0;
		
		while(r < s.length()) {
			
			if(arr[(int)s.charAt(r)]==0) {
				arr[(int)s.charAt(r)]=1;
				len = r-l+1;
				maxlen=Math.max(maxlen, len);	
				r++;
			}
			else {
				while(s.charAt(l) != s.charAt(r) ) {
					arr[(int)s.charAt(l)]=0;
					l++;
				}
				arr[(int)s.charAt(l)]=0;
				l++;
			}
		}
		return maxlen;
	}
}
