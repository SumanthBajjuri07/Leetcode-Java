class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
		int count =0;
		
		
		if(n==0) {
			return true;
		}
		
		
		if(l == 1) {
			if(flowerbed[0] == 0 && n ==1) {
				return true;
				
			}
			return false;
		}
		
		
		
		if(l >= 2) {
		if(flowerbed[0] == 0 && flowerbed[1]==0) {
			flowerbed[0]=1;
			count++;
		}
		
		if(flowerbed[l-1] == 0 && flowerbed[l-2]==0) {
			flowerbed[l-1]=1;
			count++;
		}
		}
		
		
        for(int i =1; i<l-1; i++){
            if(flowerbed[i]== 0 && flowerbed[i-1]== 0 && flowerbed[i+1]== 0) {
            	flowerbed[i] =1;
            	count++;
            }
        }
        
        
        if(count >= n) {
        	return true;
        }
         return false;
    }
}
