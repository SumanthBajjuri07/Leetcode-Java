class Solution {
    public int maxHeightOfTriangle(int red, int blue) {

        int count1=0;
		int count2=0;
		
		int r = red;
		int b = blue;
		
		// red first
				int i=1;
				int flag1=0;
				while(true) {
					if(flag1==0 && red-i>=0) {
						red=red-i;
						i++;
						flag1=1;
						count1++;
						continue;
					}
					else if(flag1==1 && blue-i>=0) {
						blue = blue-i;
						i++;
						flag1=0;
						count1++;
					}
					else {
							break;
						}
					}
				
				System.out.println(count1);
				
		
		red = r;
		blue=b;
		
		// blue first
		int j=1;
		int flag2=0;
		while(true) {
			if(flag2==0 && blue-j>=0) {
				blue=blue-j;
				j++;
				flag2=1;
				count2++;
				continue;
			}
			else if(flag2==1 && red-j>=0) {
				red = red-j;
				j++;
				flag2=0;
				count2++;
			}
			else {
					break;
				}
			}
		
		System.out.println(count2);
      
		return Math.max(count1, count2);

        
    }
}
