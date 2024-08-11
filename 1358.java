class Solution {
        public static int numberOfSubstrings(String s) {
	    int r=0;
	    int count=0;
	    int[] lastseen = {-1, -1, -1};
	    
	    while(r < s.length()) {
	    	if(s.charAt(r)=='a') {
	    		lastseen[0] = r;
	    	}
	    	else if(s.charAt(r)=='b') {
	    		lastseen[1] =r;
	    	}
	    	else if(s.charAt(r)=='c') {
	    		lastseen[2] = r;
	    	}
	    	
	    	if(lastseen[0]>-1 && lastseen[1]>-1 && lastseen[2]>-1) {
	    		count =  count + 1 + Math.min(Math.min(lastseen[0], lastseen[1]), lastseen[2]);
	    	}
	    	
	    	r++;
	    }
		
		
	    
	    return count;
	  }
}
