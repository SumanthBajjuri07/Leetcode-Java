class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

        if(s=="" && t==""){
            return true;
        }
		
		for(char ch : s.toCharArray()) {
			if(ch=='#') {
				if(s1.isEmpty()) {
					continue;
				}
				s1.pop();
			}
			else {
			
			s1.add(ch);
			}
		}
		
		
		
		for(char ch : t.toCharArray()) {
			if(ch=='#') {
				if(s2.isEmpty()) {
					continue;
				}
				s2.pop();
			}
			else {
			s2.add(ch);
			}
			}
		
		
		
		if(s1.equals(s2)) {
			return true;
		}
		else if(s1.isEmpty()==true && s2.isEmpty()==true) {
			return true;
		}
		
		return false;
    }
}
