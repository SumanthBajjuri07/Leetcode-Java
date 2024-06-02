class Solution {
    public int hammingWeight(int n) {

        int ans=0;
        int i =0;
        while ( n > 0){
            ans = ans + (n%2);
            n = n/2;
        }

        return ans;
        
    }
}
