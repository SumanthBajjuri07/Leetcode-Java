class Solution {
    public static boolean isValid(String s) {
		
		Stack<Character> s1 = new Stack<>();
		boolean flag = true;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				s1.add(s.charAt(i));
			}
			
			else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && s1.isEmpty()) {
				flag = false;
			}
			
			else if(s.charAt(i) == ')' && s1.peek()=='(') {
				s1.pop();
			}
			else if(s.charAt(i) == '}' && s1.peek()=='{') {
				s1.pop();
			}
			else if(s.charAt(i) == ']' && s1.peek()=='[') {
				s1.pop();
			}
			
			else {
				flag = false;
			}
		}
		
		if(!s1.isEmpty()) { flag = false;
		}
	        
		
		return flag;
    }
}
