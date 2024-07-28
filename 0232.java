import java.util.Stack;

class MyQueue {
	Stack<Integer> first;
	Stack<Integer> second;

    public MyQueue() {
       first = new Stack<>();
       second = new Stack<>();
    }
    
    public void push(int x) {
    	first.add(x);
        
    }
    
    public int pop() {
    	while(!first.isEmpty()) {
    		second.add(first.pop());
    	}
    	
    	int removed = second.pop();
    	
    	while(!second.isEmpty()) {
    		first.add(second.pop());
    	}
    	
		return removed;
        
    }
    
    public int peek() {
    	
    	while(!first.isEmpty()) {
    		second.add(first.pop());
    	}
    	
    	int peekofQ = second.peek();
    	
    	while(!second.isEmpty()) {
    		first.add(second.pop());
    	}
    	
		return  peekofQ;
    }
    
    public boolean empty() {
    	
		return first.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
