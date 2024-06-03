class Solution {
    public int[] countBits(int n) {


        int[] ans = new int[n+1];
        for(int i =0; i < n+1; i++){
            int m =i;
            int count =0;

            while(m > 0){
                count = count + (m %2);
                m = m/2;
            }

            ans[i] = count;

        }
        return ans;
        
    }
}
