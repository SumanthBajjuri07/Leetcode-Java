class Solution {
    public int findComplement(int num) {
        int xor =0;
        int numOfDigits = (int)(Math.log(num) / Math.log(2)) +1;
        
        for(int i =0; i<numOfDigits; i++) {
        	xor = (int) (xor + 1 * Math.pow(2, i));
        }
        
        
        
        return num ^ xor;
    
    }
}
