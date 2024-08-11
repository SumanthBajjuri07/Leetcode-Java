import java.util.HashMap;
import java.util.Map.Entry;


class Solution {
    public static int totalFruit(int[] fruits) {
	int l=0;
	int r=0;
	int maxlen=0;
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	while(r < fruits.length) {
		if(map.size() <=2) {
			if(map.containsKey(fruits[r])) {
				map.replace(fruits[r], map.get(fruits[r])+1);
			}
			else {
				map.put(fruits[r], 1);
			}
			if(map.size() <=2) { maxlen=Math.max(maxlen, r-l+1);
			
			}	
			r++;
		}
		
		else {
			while(map.size()>2) {
				map.replace(fruits[l], map.get(fruits[l])-1);
				l++;
				if(map.containsValue(0)) {
					int removal=0;
					for(Entry<Integer, Integer> entry: map.entrySet()) {
					      if(entry.getValue() == 0) {
					    	 removal=entry.getKey();
					   }
					}
					map.remove(removal);
				}
			}
			
		}		
	}
	
	return maxlen;
	}
}
